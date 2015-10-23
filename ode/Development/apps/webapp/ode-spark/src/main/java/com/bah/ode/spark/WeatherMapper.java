package com.bah.ode.spark;

import java.io.Serializable;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Row;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class WeatherMapper implements Function<Row, String>, Serializable {

	private static final long serialVersionUID = 4620485681770070995L;
	private String[] weatherHeader;

	public WeatherMapper(String[] columns) {
		weatherHeader = columns;
	}

	@Override
	public String call(Row row) throws Exception {

		ObjectNode node = JsonNodeFactory.instance.objectNode();
		
		for (int i = 0; i < row.length(); i ++ ){
			node.put(weatherHeader[i], row.getString(i));
		}
		
		return node.toString();
	}

}
