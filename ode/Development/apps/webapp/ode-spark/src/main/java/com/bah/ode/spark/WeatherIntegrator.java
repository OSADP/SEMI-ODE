package com.bah.ode.spark;

import java.awt.geom.Point2D;
import java.util.List;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.function.PairFunction;

import com.bah.ode.util.GeoUtils;
import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class WeatherIntegrator extends SparkProcessor implements
      PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String, String>> {

   private static final long serialVersionUID = 2040465851629473055L;
   private List<String> weatherData = null;

   public WeatherIntegrator(Accumulator<Integer> accumulator, List<String> weatherData) {
      super(accumulator);
      this.weatherData = weatherData;
   }

   @Override
   public Tuple2<String, Tuple2<String, String>> call(
         Tuple2<String, Tuple2<String, String>> record) throws Exception {

      startTimer();

      ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());
      if (vehicledata.has("latitude") && vehicledata.has("longitude") &&
          !(vehicledata.has("weatherAirPres") && vehicledata.has("weatherAirTemp"))) {
         Point2D rddLoc = GeoUtils.latLngToMap(
               vehicledata.get("latitude").asDouble(),
               vehicledata.get("longitude").asDouble());

         ObjectNode closestAirPressure = null;
         Double distanceAP = Double.MAX_VALUE;

         ObjectNode closestAirTemperature = null;
         Double distanceAT = Double.MAX_VALUE;

         for (String s : weatherData) {
            ObjectNode temp = JsonUtils.toObjectNode(s);
            if (temp.has("Latitude") && temp.has("Longitude")
                  && temp.has("ObsTypeName")) {
               switch (temp.get("ObsTypeName").asText()) {

               /* Atmospheric Air Pressure Source */
               case "essAtmosphericPressure":
                  if (closestAirPressure == null) {
                     closestAirPressure = temp;
                     distanceAP = rddLoc.distance(
                           GeoUtils.latLngToMap(temp.get("Latitude").asDouble(),
                                 temp.get("Longitude").asDouble()));
                  } else {
                     Point2D tempLoc = GeoUtils.latLngToMap(
                           temp.get("Latitude").asDouble(),
                           temp.get("Longitude").asDouble());
                     double calcDist = rddLoc.distance(tempLoc);
                     if (calcDist < distanceAP) {
                        distanceAP = calcDist;
                        closestAirPressure = temp;
                     }
                  }
                  break;

               /* Atmospheric Air Temperature Source */
               case "essAirTemperature":
                  if (closestAirTemperature == null) {
                     closestAirTemperature = temp;
                     distanceAT = rddLoc.distance(
                           GeoUtils.latLngToMap(temp.get("Latitude").asDouble(),
                                 temp.get("Longitude").asDouble()));
                  } else {
                     Point2D tempLoc = GeoUtils.latLngToMap(
                           temp.get("Latitude").asDouble(),
                           temp.get("Longitude").asDouble());
                     double calcDist = rddLoc.distance(tempLoc);
                     if (calcDist < distanceAT) {
                        distanceAT = calcDist;
                        closestAirTemperature = temp;
                     }
                  }
                  break;
               default:
                  break;
               }
            }
         }

         if (closestAirPressure != null && !vehicledata.has("weatherAirPres")) {
            vehicledata.put("weatherAirPres",
                  closestAirPressure.get("Observation").asText());
         }

         if (closestAirTemperature != null
               && !vehicledata.has("weatherAirTemp")) {
            vehicledata.put("weatherAirTemp",
                  closestAirTemperature.get("Observation").asText());
         }
      } else {
         return record;
      }

      stopTimer();
      
      return new Tuple2<String, Tuple2<String, String>>(record._1(),
            new Tuple2<String, String>(vehicledata.toString(),
                  record._2()._2()));

   }

}
