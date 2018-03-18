
# Spark-BigData-Twitter-Sentiment-Analyzer
Twitter's Tweets Stream Sentiment Analyser using Apache Spark - Spark Stream, Spark SQL , Stanford NLP(Natural Language Processing)


Data mining is a field where one applies machine learning and statistical techniques to some concrete problems. Every new project covers a different field. This gives me the opportunity to discover and learn new domains without changing my job profile.  Recently, I have developed an interest in deep learning. A concept of teaching computers how to learn, this really excites me!

Requirements :  
IntelliJ IDEA 2017.3.4 (Community Edition) , Java SDK 1.8 , Scala 2.11 , SBT 1.1.1 , Apache Spark 2.2.0

Spark - a quick introduction
For those of you that haven’t heard of Spark before, it’s a project written by the folks over at Berkeley, and is a key component of their Berkeley Data Analytics Stack. It is written mostly in Scala, and provides APIs for Scala, Java and Python. It is fully compatible with Hadoop Distributed File System, but extends on Hadoop’s core functionality by providing in-memory cluster computation, and, most importantly for this blog post, a stream handling framework.

If you’re interested in finding out more about Spark, they offer a free online introductory course (that will set you back about $10 in Amazon EC2 fees). However, at the time of writing, the streaming exercise doesn’t work as the EC2 image is based on an old version of Spark that uses a decommissioned Twitter API.

Spark Streaming
To consume a stream of data in Spark you need to have a StreamingContext in which you register an InputDStream that in turn can produce a Receiver object. Spark provides a number of default implementations of these (e.g. Twitter, Akka Actor, ZeroMQ, etc.) that are accessible from the context. 

