package com.bah.test.org.apache.spark.examples.streaming;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

/**
 * Hello world!
 *
 */
public class App {
   public static void main(String[] args) {
      SparkConf conf = new SparkConf().setMaster("local").setAppName("App");
      JavaSparkContext sc = new JavaSparkContext(conf);
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
      
      String str = null;
      do {
         str = scanner.nextLine();
         if (str.equalsIgnoreCase("quit"))
            break;
         JavaRDD<String> input = sc.textFile("pg8789.txt");
         // Split words
         JavaRDD<String> words = input
               .flatMap(new FlatMapFunction<String, String>() {
                  private static final long serialVersionUID = 1L;

                  public Iterable<String> call(String x) {
                     return Arrays.asList(x.split(" "));
                  }
               });
         // Transform and counts
         JavaPairRDD<String, Integer> counts = words.mapToPair(
               new PairFunction<String, String, Integer>() {
                  private static final long serialVersionUID = 1L;

                  public Tuple2<String, Integer> call(String x) {
                     return new Tuple2<String, Integer>(x, 1);
                  }
               }).reduceByKey(new Function2<Integer, Integer, Integer>() {
            private static final long serialVersionUID = 1L;

            public Integer call(Integer x, Integer y) {
               return x + y;
            }
         });

         counts.saveAsTextFile("output.txt" + sdf.format(new Date()));
      } while (true);
      
      sc.stop();
      sc.close();
      scanner.close();
   }
}
