name := "Spark-TWSentimentAnalyzer"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-sql" % "2.2.0",
  "org.apache.spark" %% "spark-streaming" % "2.2.0",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.2.0"
)


libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1"
libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1" classifier "models"
libraryDependencies += "edu.stanford.nlp" % "stanford-parser" % "3.9.1"
//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.5.1" classifier "models"


//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1"

//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.5.1"
//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.5.1" classifier "models"

//libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.1"

//libraryDependencies += "org.apache.spark" %% "spark-core_2.11" % "2.2.1"
//libraryDependencies += "org.apache.spark" %% "spark-sql_2.11" % "2.2.1"
//libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.2.1"
//libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter_2.11" % "2.2.1"


/*
"org.twitter4j" % "twitter4j-core" % "3.0.0",
  "org.twitter4j" % "twitter4j-stream" % "3.0.0",


   "org.twitter4j" % "twitter4j-core" % "3.0.0",
  "org.twitter4j" % "twitter4j-stream" % "3.0.0",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.2.0"
 */
