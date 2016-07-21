package com.bah.ode.spark;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.function.Function;

import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdePayloadViolation;
import com.bah.ode.util.JsonUtils;

import scala.Tuple2;

public class SpeedValidator extends SparkProcessor 
   implements Function<Tuple2<String, Tuple2<String, String>>, Boolean> {

   public SpeedValidator(Accumulator<Integer> accumulator) {
      super(accumulator);
   }

   private static final long serialVersionUID = 6436827709072402370L;

   @Override
   public Boolean call(Tuple2<String, Tuple2<String, String>> record)
         throws Exception {
      
      startTimer();
      
      Tuple2<String, String> value = record._2();
      String sMetatdat = value._2();

      boolean validSpeed = true;
      if (sMetatdat != null) {
         OdeMetadata metadata = (OdeMetadata) JsonUtils.fromJson(sMetatdat, 
               OdeMetadata.class);
         
         if (metadata != null && metadata.getViolations() != null) {
            for (OdePayloadViolation violation : metadata.getViolations()) {
               if (violation.getFieldName().equals("speed")) {
                  validSpeed = false;
                  break;
               }
            }
         }
      }
      
      stopTimer();
      
      return validSpeed;
   }

}
