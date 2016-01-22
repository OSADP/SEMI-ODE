package com.bah.ode.spark;



import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.function.PairFunction;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class RecordValidator implements  PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String,String>> {

	private static final long serialVersionUID = 2040465851629473055L;
	private List<String> validationData = null;

	public RecordValidator(List<String> validationData) {
		this.validationData = validationData;
	}

	@Override
	public Tuple2<String, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, String>> record) throws Exception {
		if(!record._1().equals("sanitized")){
			ArrayList<ObjectNode> violations = new ArrayList<ObjectNode>();
			ObjectNode metadata = JsonUtils.toObjectNode(record._2()._2());

			for(String validationJSON : validationData){

				ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());

				ObjectNode validationCheck = JsonUtils.toObjectNode(validationJSON);

				String fieldName = validationCheck.get("fieldName").asText("");
				double minValue = validationCheck.get("minValue").asDouble(Double.NaN);
				double maxValue = validationCheck.get("maxValue").asDouble(Double.NaN);

				JsonNode temp = vehicledata.get(fieldName);
				
				if (temp != null) {
   				double vehicleField = temp.asDouble(Double.NaN);
   
   				if(!fieldName.equals("") && vehicleField != Double.NaN && minValue != Double.NaN && maxValue != Double.NaN){
   					if(vehicleField < minValue || maxValue < vehicleField){
   						ObjectNode node = JsonNodeFactory.instance.objectNode();
   						node.put("fieldName", fieldName);
   						node.put("validMin", minValue);
   						node.put("validMax", maxValue);
   
   						violations.add(node);
   					}
   				}
				}
			}

			if (violations.size() > 0)
			   metadata.putArray("violations").addAll(violations);

			return new Tuple2<String, Tuple2<String, String>>(record._1(), new Tuple2<String,String>(record._2()._1(), metadata.toString()));



		}

		return record;
	}

}
