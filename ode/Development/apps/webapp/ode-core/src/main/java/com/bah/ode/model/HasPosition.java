package com.bah.ode.model;

import java.math.BigDecimal;

public interface HasPosition extends OdeFilterable {
   BigDecimal getLatitude();
   BigDecimal getLongitude();
   BigDecimal getElevation();

}
