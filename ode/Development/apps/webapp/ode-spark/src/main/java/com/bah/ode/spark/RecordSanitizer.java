package com.bah.ode.spark;



import java.util.List;

import org.apache.log4j.Logger;
import org.apache.spark.api.java.function.PairFunction;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class RecordSanitizer implements  PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String,String>> {

	private static final long serialVersionUID = 2040465851629473055L;
	private List<String> sanitizationData = null;

	public RecordSanitizer(List<String> sanitizationData) {
		this.sanitizationData = sanitizationData;
	}

	@Override
	public Tuple2<String, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, String>> record) throws Exception {

		ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());
		double record_latitude = vehicledata.get("latitude").asDouble();
		double record_longitude = vehicledata.get("longitude").asDouble();
		for(String sanitizationJSON : sanitizationData){

			/* 
			 * boolean that determines if it meets an exception for being hidden, 
			 * if true then continue looking for another box
			 * Reason: if one box restricts it later on then it should not be shown.
			 */
			boolean excepted = false;

			ObjectNode sanitizationBox = JsonUtils.toObjectNode(sanitizationJSON);
			double nwLat = sanitizationBox.get("nwLat").asDouble();
			double nwLon = sanitizationBox.get("nwLon").asDouble();
			double seLat = sanitizationBox.get("seLat").asDouble();
			double seLon = sanitizationBox.get("seLon").asDouble();

			/* Inside a sanitizationBox*/
			if(record_latitude <= nwLat && record_latitude >= seLat && record_longitude >= nwLon && record_longitude <= seLon){

				/* Inside sanitizationBox, but outside of speed limits */
				if(sanitizationBox.has("minSpeed") && sanitizationBox.has("maxSpeed") && vehicledata.has("speed")){
					double minSpeed = sanitizationBox.get("minSpeed").asDouble();
					double maxSpeed = sanitizationBox.get("maxSpeed").asDouble();
					double record_speed = vehicledata.get("speed").asDouble();
					if(record_speed < minSpeed || record_speed > maxSpeed){
						excepted = true;
					}
				}

				/* Inside a sanitizationBox, but meets groupID exception*/
				if(sanitizationBox.has("exceptions") && vehicledata.has("groupId")){
					String[] groupIDs = sanitizationBox.get("exceptions").asText().split(",");
					String record_groupID = vehicledata.get("groupId").asText();
					for(String excludedID : groupIDs){
						if(excludedID.contains(record_groupID)){
							excepted = true;
						}
					}
				}

				/* Should not be returned because it meets the bounding box record */
				if(!excepted)
					return null;
			}
		}

		return record;
	}

}
