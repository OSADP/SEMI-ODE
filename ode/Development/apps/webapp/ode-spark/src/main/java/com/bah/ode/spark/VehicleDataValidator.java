package com.bah.ode.spark;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.Accumulator;
import org.apache.spark.api.java.function.PairFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.util.JsonUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import scala.Tuple2;

public class VehicleDataValidator extends SparkProcessor 
   implements PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String, String>> {

   private static final long serialVersionUID = 2040465851629473055L;
   
   private static Logger logger = LoggerFactory.getLogger(VehicleDataValidator.class);

   private List<String> validationData = null;

   public VehicleDataValidator(Accumulator<Integer> accumulator, List<String> validationData) {
      super(accumulator);
      this.validationData = validationData;
   }

   @Override
   public Tuple2<String, Tuple2<String, String>> call(
         Tuple2<String, Tuple2<String, String>> record) throws Exception {

      startTimer();

      if (!record._1().equals("sanitized")) {
         ArrayList<ObjectNode> violations = new ArrayList<ObjectNode>();
         ObjectNode metadata = JsonUtils.toObjectNode(record._2()._2());

         for (String validationJSON : validationData) {

            ObjectNode vehicledata = JsonUtils.toObjectNode(record._2()._1());

            ObjectNode validationCheck = JsonUtils.toObjectNode(validationJSON);

            JsonNode fieldName = validationCheck.get("fieldName");
            JsonNode minValue = validationCheck.get("minValue");
            JsonNode maxValue = validationCheck.get("maxValue");

            if (fieldName != null && minValue != null && maxValue != null) {
               String sFieldName = fieldName.asText();
               if (!sFieldName.isEmpty()) {
                  JsonNode dataElement = vehicledata.get(sFieldName);

                  if (dataElement != null) {
                     double vehicleField = dataElement.asDouble();

                     double dMinValue = minValue.asDouble();
                     double dMaxValue = maxValue.asDouble();
                     if (vehicleField < dMinValue || dMaxValue < vehicleField) {
                        ObjectNode node = JsonNodeFactory.instance.objectNode();
                        node.put("fieldName", sFieldName);
                        node.put("validMin", dMinValue);
                        node.put("validMax", dMaxValue);

                        violations.add(node);
                     }
                  }
               } else {
                  logger.error("Validation record missing 'fieldName': {}", validationJSON);
               }
            } else {
               logger.error("Validation record  missing 'fieldName', 'minValue', or 'maxValue': {}",
                     validationJSON);
            }
         }

         if (violations.size() > 0)
            metadata.putArray("violations").addAll(violations);

         return new Tuple2<String, Tuple2<String, String>>(record._1(),
               new Tuple2<String, String>(record._2()._1(),
                     metadata.toString()));

      }

      stopTimer();
      
      return record;
   }

}
