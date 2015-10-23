package com.bah.ode.spark;

import java.util.List;

import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRoadSegment;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.util.JsonUtils;

public class RoadSegmentIntegrator implements 
PairFunction<Tuple2<String,Tuple2<String,String>>,String,Tuple2<String,String>> {

   private static final long serialVersionUID = -6411271453863200897L;

   @Override
   public Tuple2<String, Tuple2<String, String>> call(
         Tuple2<String, Tuple2<String, String>> arg0) throws Exception {
      String key = arg0._1();
      Tuple2<String, String> value = arg0._2();
      String sMetatdat = value._1();
      String sPayload = value._2();
//      ObjectNode payload = JsonUtils.toObjectNode(sMetatdat);
//      ObjectNode metadata = JsonUtils.toObjectNode(sPayload);

      OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(sMetatdat, OdeMetadata.class);
      OdeVehicleDataFlat ovdf = (OdeVehicleDataFlat) JsonUtils.fromJson(sPayload, OdeVehicleDataFlat.class);
      
      List<OdeRoadSegment> roadSegments = metadata.getOdeRequest().getPolyline().getSegments();
      ovdf.setRoadSegment(roadSegments);
      
      Tuple2<String, Tuple2<String, String>> withRoadSeg = 
            new Tuple2<String, Tuple2<String,String>>(key, arg0._2);
      return withRoadSeg;
   }

}
