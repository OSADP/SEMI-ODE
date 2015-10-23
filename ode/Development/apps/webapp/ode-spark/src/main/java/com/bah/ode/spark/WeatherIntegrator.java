package com.bah.ode.spark;

import org.apache.spark.api.java.function.PairFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import scala.Tuple2;

public class WeatherIntegrator implements  PairFunction<Tuple2<String, Tuple2<String, String>>, String, Tuple2<String,String>> {

	private static final long serialVersionUID = 898L;
	private static Logger logger = LoggerFactory
			.getLogger(WeatherIntegrator.class);

	@Override
	public Tuple2<String, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, String>> record)
			throws Exception {
		logger.info("Topic: " + record._1());
		logger.info("KEY: " + record._2()._1());
		logger.info("VALUE: " + record._2()._2());
        return record;

	}

}