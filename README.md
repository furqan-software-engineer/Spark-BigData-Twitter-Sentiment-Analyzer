
# Spark-BigData-Twitter-Sentiment-Analyzer
Twitter's Tweets Stream Sentiment Analyser using Apache Spark - Spark Stream, Spark SQL , Stanford NLP(Natural Language Processing)


Data mining is a field where one applies machine learning and statistical techniques to some concrete problems. Every new project covers a different field. This gives me the opportunity to discover and learn new domains without changing my job profile.  Recently, I have developed an interest in deep learning. A concept of teaching computers how to learn, this really excites me!

Requirements :  
IntelliJ IDEA 2017.3.4 (Community Edition) , Java SDK 1.8 , Scala 2.11 , SBT 1.1.1 , Apache Spark 2.2.0 , Stanford NLP Library 3.9.1

Spark - a quick introduction
For those of you that haven’t heard of Spark before, it’s a project written by the folks over at Berkeley, and is a key component of their Berkeley Data Analytics Stack. It is written mostly in Scala, and provides APIs for Scala, Java and Python. It is fully compatible with Hadoop Distributed File System, but extends on Hadoop’s core functionality by providing in-memory cluster computation


Spark Streaming
To consume a stream of data in Spark you need to have a StreamingContext in which you register an InputDStream that in turn can produce a Receiver object. Spark provides a number of default implementations of these (e.g. Twitter, Akka Actor, ZeroMQ, etc.) that are accessible from the context. 

Streaming Twitter Data Using Spark
We use spark streaming to stream live spark data. To load Twitter data into Apache Spark twitter provides an interface to developers which can be used to access twitter data. Visit twitters applications site to register your application "https://apps.twitter.com/"  .Replace your credentials in scala file of the project ,  which are needed to initialize spark streaming context.
The streaming data is captured into batches. The interval for downloading batches can be set, I have set the interval to be 10 seconds. Therefore, every 10 seconds a new batch of data is streamed and captured into batches.

Algorithm and Sentiment Analysis
Sentiment analysis is performed using Stanford’s Natural Language Processing library. It takes text input and sends this library to get the sentiment in return. This library constructs a tree like structure out of the plain text passed to it, this structured is created after cleaning the data and removing all the stop words.

Developed Model
The model should be reviewed and checked before using it for obtaining results. The results obtained after mining the data should be analyzed meticulously and interpreted by experts in order to perform efficient data analysis.
