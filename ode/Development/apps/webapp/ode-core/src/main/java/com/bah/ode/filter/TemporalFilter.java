package com.bah.ode.filter;

import java.text.ParseException;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.HasTimestamp;
import com.bah.ode.model.OdeFilterable;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.util.DateTimeUtils;

public class TemporalFilter extends BaseFilter {
   private static Logger logger = LoggerFactory.getLogger(TemporalFilter.class);
   private ZonedDateTime startDate;
   private ZonedDateTime endDate;

   public TemporalFilter() {
      super();
   }

   public TemporalFilter(OdeMetadata metadata) {
      super();
      this.setMetadata(metadata);
   }

   @Override
   public boolean pass(OdeFilterable data) {
      if (data instanceof HasTimestamp) {
         HasTimestamp hasTimestamp = (HasTimestamp) data;

         if (startDate == null) {
            if (endDate == null) {// Both startDate and endDate are null, so it's pass by default
               return true;
            } else {// We only have the endDate, so any record not after the end date is a pass
               return !hasTimestamp.getTimestamp().isAfter(endDate);
            }
         } else {
            if (endDate == null) {// We only have the startDate, so any record not before the start date is a pass
               return !hasTimestamp.getTimestamp().isBefore(startDate);
            } else {// We have both the startDate and the endDate, so any record not before the start date and not after the end date is a pass
               return !hasTimestamp.getTimestamp().isBefore(startDate) &&
                     !hasTimestamp.getTimestamp().isAfter(endDate);
            }
         }
      } else {
         return true;
      }
   }

   @Override
   public BaseFilter setMetadata(OdeMetadata metadata) {
      super.setMetadata(metadata);
      if (getMetadata().getOdeRequest() != null &&
            getMetadata().getOdeRequest() instanceof OdeQryRequest) {
         OdeQryRequest qryReq = (OdeQryRequest) getMetadata().getOdeRequest();
         
         if (qryReq.getStartDate() != null) {
            try {
               startDate = DateTimeUtils.isoDateTime(qryReq.getStartDate());
            } catch (ParseException e) {
               logger.error("Error parsing start date: " + qryReq.getStartDate(), e);
            }
         }
         
         if (qryReq.getEndDate() != null) {
            try {
               endDate = DateTimeUtils.isoDateTime(qryReq.getEndDate());
            } catch (ParseException e) {
               logger.error("Error parsing end date: " + qryReq.getEndDate(), e);
            }
         }
      }
      return this;
   }
   
   
}
