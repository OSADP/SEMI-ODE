package com.bah.ode.spark;

import java.awt.geom.Point2D;
import java.util.List;

import org.apache.spark.api.java.function.PairFunction;

import com.bah.ode.util.GeoUtils;
import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class WeatherIntegrator implements  PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String,String>> {

	private static final long serialVersionUID = 2040465851629473055L;
	private List<String> weatherData = null;
	private String[] columns = null;

	public WeatherIntegrator(List<String> weatherData, String[] columns) {
		this.weatherData = weatherData;
		this.columns = columns;
	}

	@Override
	public Tuple2<String, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, String>> record)
			throws Exception {

		ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());
		Point2D rddLoc = GeoUtils.latLngToMap(vehicledata.get("latitude").asDouble(),vehicledata.get("longitude").asDouble());

		ObjectNode closestNode = null;
		Double distance = Double.MAX_VALUE;

		for(String s : weatherData){
			ObjectNode temp = JsonUtils.toObjectNode(s);
			if(closestNode == null){
				closestNode = temp;
				distance = rddLoc.distance(GeoUtils.latLngToMap(temp.get("Latitude").asDouble(), temp.get("Longitude").asDouble()));
			}else{
				Point2D tempLoc = GeoUtils.latLngToMap(temp.get("Latitude").asDouble(),temp.get("Longitude").asDouble());
				double calcDist = rddLoc.distance(tempLoc);
				if(calcDist < distance){
					distance = calcDist; 
					closestNode = temp;
				}
			}
		}

		for(String s : columns){
			vehicledata.put(s, closestNode.get(s).asText());
		}
		
		return new Tuple2<String, Tuple2<String, String>>(record._1(), new Tuple2<String,String>(vehicledata.toString(), record._2()._2()));

	}

}