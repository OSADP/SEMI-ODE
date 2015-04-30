package com.bah.test.org.apache.spark.examples.streaming;

import java.util.Arrays;
import java.util.List;
import java.lang.Iterable;

import scala.Tuple2;

import org.apache.commons.lang.StringUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SparkConf conf = new SparkConf().setAppName("App");
    	JavaSparkContext sc = new JavaSparkContext(conf);
    	JavaRDD<String> input = sc.textFile("/vagrant/pg8789.txt");
        System.out.println( "Hello World!" );
       // Split words 
        JavaRDD<String> words = input.flatMap(
        	new FlatMapFunction<String, String>(){
        		public Iterable<String> call(String x)
        		{
        			return Arrays.asList(x.split(" "));
        		} 
        });
        // Transform and counts
        JavaPairRDD<String,Integer > counts = words.mapToPair(new PairFunction<String,String, Integer>(){
        	public Tuple2<String, Integer> call(String x)
        	{
        		return new Tuple2(x,1);
        	}	
        }).reduceByKey(new Function2<Integer, Integer, Integer>(){
        	public Integer call(Integer x, Integer y) 
    		{ return x+y;}});
        
        counts.saveAsTextFile("/vagrant/output.txt");
    }
}
