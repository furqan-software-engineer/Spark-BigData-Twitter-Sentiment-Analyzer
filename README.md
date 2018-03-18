
# Spark-BigData-Twitter-Sentiment-Analyzer

Twitter's Tweets Stream Sentiment Analyser using Apache Spark - Spark Stream, Spark SQL , Stanford NLP(Natural Language Processing)

Requirments

IntelliJ IDEA 2017.3.4 (Community Edition) , Java SDK 1.8 , Scala 2.11 , SBT 1.1.1 , Apache Spark 2.2.0 , Stanford NLP Library 3.9.1

Downalod Stanford NLP Model file (English Model Used - stanford-corenlp-3.9.1-models-english.jar)
home brew installations:
brew install scala.  , brew install sbt@1
IntelliJ IDEA install Scala plugin
Download Spark and execute following command from your own project folder in Terminal

/Users/furqan/Documents/spark-2.2.0-bin-hadoop2.7/bin/spark-submit --jars /Users/furqan/IdeaProjects/Spark-TWSentimentAnalyzer/stanford-corenlp-3.9.1-models-english.jar --driver-class-path /Users/furqan/IdeaProjects/Spark-TWSentimentAnalyzer/stanford-corenlp-3.9.1-models-english.jar --conf spark.executor.extraClassPath=/Users/furqan/IdeaProjects/Spark-TWSentimentAnalyzer/stanford-corenlp-3.9.1-models-english.jar --class "TwitterStreamAnalyzer" --master local[4] --packages "org.apache.bahir:spark-streaming-twitter_2.11:2.2.0,edu.stanford.nlp:stanford-corenlp:3.9.1,org.apache.spark:spark-sql_2.11:2.2.0" /Users/furqan/IdeaProjects/Spark-TWSentimentAnalyzer/target/scala-2.11/spark-twsentimentanalyzer_2.11-1.0.jar



Spark - a quick introduction

For those of you that haven’t heard of Spark before, it’s a project written by the folks over at Berkeley, and is a key component of their Berkeley Data Analytics Stack. It is written mostly in Scala, and provides APIs for Scala, Java and Python. It is fully compatible with Hadoop Distributed File System, but extends on Hadoop’s core functionality by providing in-memory cluster computation


Spark Streaming

To consume a stream of data in Spark you need to have a StreamingContext in which you register an InputDStream that in turn can produce a Receiver object. Spark provides a number of default implementations of these (e.g. Twitter, Akka Actor, ZeroMQ, etc.) that are accessible from the context.
https://spark.apache.org/docs/2.2.0/streaming-programming-guide.html

Streaming Twitter Data Using Spark

We use spark streaming to stream live spark data. To load Twitter data into Apache Spark twitter provides an interface to developers which can be used to access twitter data. Visit twitters applications site to register your application "https://apps.twitter.com/"  .Replace your credentials in scala file of the project ,  which are needed to initialize spark streaming context.
The streaming data is captured into batches. The interval for downloading batches can be set, I have set the interval to be 10 seconds. Therefore, every 10 seconds a new batch of data is streamed and captured into batches.

Algorithm and Sentiment Analysis

Sentiment analysis is performed using Stanford’s Natural Language Processing library. It takes text input and sends this library to get the sentiment in return. This library constructs a tree like structure out of the plain text passed to it, this structured is created after cleaning the data and removing all the stop words.
https://stanfordnlp.github.io/CoreNLP/

Developed Model

The model should be reviewed and checked before using it for obtaining results. The results obtained after mining the data should be analyzed meticulously and interpreted by experts in order to perform efficient data analysis.
