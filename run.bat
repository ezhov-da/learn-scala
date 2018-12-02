CD /D %~dp0

SET SCALA_JAR=D:\programs\sbt-1.2.6\sbt\lib\local-preloaded\org.scala-lang\scala-library\2.12.7\jars\scala-library.jar
SET BUILD_JAR=%~dp0\target\scala-2.12\hello-world_2.12-1.0.jar

java -cp %SCALA_JAR%;%BUILD_JAR% ru.ezhov.learn.ceph.CephClient