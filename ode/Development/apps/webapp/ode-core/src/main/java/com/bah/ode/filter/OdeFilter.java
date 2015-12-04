package com.bah.ode.filter;

import com.bah.ode.model.OdeFilterable;

public interface OdeFilter {
   boolean pass(OdeFilterable data);
}
