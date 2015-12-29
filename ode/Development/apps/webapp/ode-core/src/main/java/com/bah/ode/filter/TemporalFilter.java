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
         ZonedDateTime dateTime = hasTimestamp.getTimestamp();
         return DateTimeUtils.isBetweenTimesInclusive(dateTime, startDate, endDate);
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
