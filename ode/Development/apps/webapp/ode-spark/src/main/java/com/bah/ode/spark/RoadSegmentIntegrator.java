package com.bah.ode.spark;

import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.util.JsonUtils;

public class RoadSegmentIntegrator implements 
PairFunction<Tuple2<String,Tuple2<String,String>>,String,Tuple2<String,String>> {

   private static final long serialVersionUID = -6411271453863200897L;
   
   private double snappingTolerance;
   
   public RoadSegmentIntegrator(double snappingTolerance) {
      this.snappingTolerance = snappingTolerance;
   }

   @Override
   public Tuple2<String, Tuple2<String, String>> call(
         Tuple2<String, Tuple2<String, String>> arg0) throws Exception {
      String key = arg0._1();
      Tuple2<String, String> value = arg0._2();
      String sPayload = value._1();
      String sMetatdat = value._2();

      Tuple2<String, Tuple2<String, String>> withRoadSeg;
      if (sPayload != null && sMetatdat != null) {
         OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(sMetatdat, OdeMetadata.class);
         OdeVehicleDataFlat ovdf = (OdeVehicleDataFlat) JsonUtils.fromJson(sPayload, OdeVehicleDataFlat.class);
         
         if (metadata != null &&
               metadata.getOdeRequest() != null &&
               metadata.getOdeRequest().getPolyline() != null &&
               ovdf != null) {
                  ovdf.setRoadSegment(
                      metadata.getOdeRequest().getPolyline().getSegments(), 
                      snappingTolerance);
         } else {
            ovdf.setRoadSeg("");
         }
         
         withRoadSeg = new Tuple2<String, Tuple2<String,String>>(key, 
                     new Tuple2<String, String>(ovdf.toJson(), sMetatdat));
      } else {
         withRoadSeg = new Tuple2<String, Tuple2<String,String>>(key, 
               new Tuple2<String, String>(sPayload, sMetatdat));
      }
      return withRoadSeg;
   }

}
