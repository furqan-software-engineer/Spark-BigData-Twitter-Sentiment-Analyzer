
/*
  Twitter Stream Sentiment Analyzer
  Apache Spark, Spark Stream, Spark SQL , Stanford NLP(Natural Language Processing)
  Created By: Muhammad Furqan
  Software Engineer (furqan_isl@hotmail.com)
*/


import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter._


object TwitterStreamAnalyzer {

  def main(args: Array[String]): Unit = {

//    val config = new SparkConf().setAppName("twitter-stream-sentiment")
//    val sc = new SparkContext(config)
//    sc.setLogLevel("WARN")


    // From Spark 2.0.0 to onward use SparkSession (managing Context)
    val spark = SparkSession.builder.appName("twitter-sentiment-analysis").getOrCreate()
    val sc = spark.sparkContext
    // Create Spark Streaming Context
    val ssc = new StreamingContext(sc, Seconds(10))

    // Twitter App API Credentials - underlying twitter4j Library
    System.setProperty("twitter4j.oauth.consumerKey", "0Xz7J9xyAggmU9BYQbbZ8VubC")
    System.setProperty("twitter4j.oauth.consumerSecret", "VRJUsIEB90QO5MTGXX6wRl74dn1cBzZiz2EfnDRU3gnZueoAiU")
    System.setProperty("twitter4j.oauth.accessToken", "1483059830-kPmvWcVjtOUTrlemr8lgSHH8xAIE6UDDBrtqqJt")
    System.setProperty("twitter4j.oauth.accessTokenSecret", "KuX0a0lOq5KAXTcjjc1QUiogtebG0fAQIHpESVrqsTgFM")

    val filters = Seq("iphone","samsung galaxy,samsung note")
//    val twitterStream = TwitterUtils.createStream(ssc,None,filters)
    val twitterStream = TwitterUtils.createStream(ssc,None)
    val englishTweets = twitterStream.filter(_.getLang == "en")
    englishTweets.map(_.getText).print()


    // DStream Created using Stanford NLP Library
    // English Model Used (stanford-corenlp-3.9.1-models-english.jar)
    val dataDS = englishTweets.map { tweet =>
      val sentiment = NLPManager.detectSentiment(tweet.getText)
      val tags = tweet.getHashtagEntities.map(_.getText.toLowerCase)
//      println("(" + tweet.getText + " | " + sentiment.toString + " | " + tags)
      (tweet.getText, sentiment.toString, tags)
    }


    val sqlContex = spark.sqlContext

//    var dataRDD : org.apache.spark.rdd.RDD[(String,String,Array[String])] = sc.emptyRDD
    dataDS.cache().foreachRDD(rdd => {
      val df = spark.createDataFrame(rdd)
      df.show()
      df.createOrReplaceTempView("sentiments")
      sqlContex.sql("select * from sentiments limit 20").show()
      // Combine RDDs
//      dataRDD.union(rdd)
    })

    /*
    // Convert DataFrame into SQL Table
    val df = spark.createDataFrame(dataRDD)
    df.show()
    df.createOrReplaceTempView("sentiments")
    sqlContex.sql("select * from sentiments limit 30").show()
    */


    ssc.start()
    ssc.awaitTermination()
//    spark.wait()

  }

}
