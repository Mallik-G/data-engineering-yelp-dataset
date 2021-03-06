import sbt.Package.ManifestAttributes

name := "spark-hbase"
version := "1.0"
scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" % "spark-core" % "1.6.0" % "provided"
libraryDependencies += "it.nerdammer.bigdata" % "spark-hbase-connector_2.10" % "1.0.3"  excludeAll(ExclusionRule(organization = "org.apache.hbase", name="hbase-server"),ExclusionRule(organization = "javax.servlet", name="javax.servlet-api"), ExclusionRule(organization = "org.mortbay.jetty"), ExclusionRule(organization = "org.codehaus.jackson", name="jackson-core-asl"), ExclusionRule(organization = "tomcat"), ExclusionRule(organization = "junit", name="junit"), ExclusionRule(organization = "com.sun.jersey", name="jersey-server"), ExclusionRule(organization = "com.sun.jersey", name="jersey-core"), ExclusionRule(organization = "commons-io"), ExclusionRule(organization = "commons-cli"), ExclusionRule(organization = "commons-el"), ExclusionRule(organization = "org.apache.commons"), ExclusionRule(organization = "commons-lang"), ExclusionRule(organization = "commons-logging"), ExclusionRule(organization = "commons-codec"), ExclusionRule(organization = "commons-httpclient"), ExclusionRule(organization = "commons-collections"), ExclusionRule(organization = "org.jruby.jcodings"), ExclusionRule(organization = "org.jruby"), ExclusionRule(organization = "org.slf4j"), ExclusionRule(organization = "com.yammer.metrics"), ExclusionRule(organization = "com.github.stephenc.findbugs"), ExclusionRule(organization = "log4j"))
