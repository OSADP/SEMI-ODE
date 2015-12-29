package com.bah.ode.model;

import java.time.ZonedDateTime;

public interface HasTimestamp extends OdeFilterable {
   ZonedDateTime getTimestamp();
   boolean isOnTime(ZonedDateTime dateTime);
}
