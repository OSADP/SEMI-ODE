package com.bah.ode.spark;



import java.util.List;

import org.apache.log4j.Logger;
import org.apache.spark.api.java.function.PairFunction;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class RecordSanitizer implements  PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String,String>> {

	private static final long serialVersionUID = 2040465851629473055L;
	private static Logger logger = Logger.getLogger(RecordSanitizer.class);
	private List<String> sanitizationData = null;

	public RecordSanitizer(List<String> sanitizationData) {
		this.sanitizationData = sanitizationData;
	}

	@Override
	public Tuple2<String, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, String>> record)
	throws Exception {

		ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());
		double record_latitude = vehicledata.get("latitude").asDouble();
		double record_longitude = vehicledata.get("longitude").asDouble();
		double speed = vehicledata.get("speed").asDouble();
		if(speed > 5){
			return record;
		}else{
			return null;
		}
	}

}
