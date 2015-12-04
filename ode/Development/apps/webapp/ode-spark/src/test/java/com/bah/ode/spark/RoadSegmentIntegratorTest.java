package com.bah.ode.spark;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import scala.Tuple2;

import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdePoint;
import com.bah.ode.model.OdePolyline;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeRoadSegment;
import com.bah.ode.model.OdeSubRequest;
import com.bah.ode.model.OdeVehicleDataFlat;
import com.bah.ode.util.JsonUtils;

public class RoadSegmentIntegratorTest extends TestCase {

   public void testCall() throws Exception {
      RoadSegmentIntegrator integrator = new RoadSegmentIntegrator(10000.0);
      String key = "key1";
      String segId = "s1NB";
      String payload = "{\"className\":\"com.bah.ode.model.OdeVehicleDataFlat\",\"serialId\":\"10817812-036b-4d7b-867b-ae0bc62a2b3e.0\",\"receivedAt\":\"2015-07-22T19:21:16.413+0000\",\"groupId\":\"4130008F\",\"accelLong\":0.34,\"accelVert\":0,\"accellYaw\":8.42,\"heading\":65.95,\"speed\":8.12,\"sizeLength\":500,\"sizeWidth\":200,\"latitude\":42.3296667,\"longitude\":-83.044539,\"elevation\":156.9,\"tempId\":\"C4290123\",\"year\":2015,\"month\":5,\"day\":13,\"hour\":15,\"minute\":52,\"second\":45.5,\"dateTime\":\"2015-06-13T19:52:45.500+0000\"}";
      OdeVehicleDataFlat ovdf = (OdeVehicleDataFlat)JsonUtils.fromJson(payload , OdeVehicleDataFlat.class);
      List<OdeRoadSegment> segments = new ArrayList<OdeRoadSegment>();
      segments.add(new OdeRoadSegment()
         .setId(segId)
         .setStartPoint(new OdePoint(BigDecimal.valueOf(42.2), BigDecimal.valueOf(-83.1)))
         .setEndPoint(new OdePoint(BigDecimal.valueOf(42.4), BigDecimal.valueOf(-82.9)))
      );
      OdeMetadata metadata = new OdeMetadata()
         .setKey(key)
         .setOdeRequest(new OdeSubRequest()
            .setDataType(OdeDataType.VehicleData)
            .setRequestType(OdeRequestType.Subscription)
            .setPolyline(new OdePolyline()
               .setSegments(segments)
            )
          );

      Tuple2<String, String> value = new Tuple2<String, String>(ovdf.toJson() , metadata.toJson());
      Tuple2<String, Tuple2<String, String>> tIn = new Tuple2<String, Tuple2<String,String>>(key , value );
      Tuple2<String, Tuple2<String, String>> tOut = integrator.call(tIn);
      
      ovdf = (OdeVehicleDataFlat)JsonUtils.fromJson(tOut._2()._1() , OdeVehicleDataFlat.class);
      
      assertEquals(segId, ovdf.getRoadSeg());
   }

}
