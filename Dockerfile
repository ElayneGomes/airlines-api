FROM openjdk:11-jre-slim

WORKDIR /airlines

COPY target/*.jar /airlines/app.jar

EXPOSE 8080

CMD java -XX:+UseContainerSupport -Xmx512m -jar app.jar --server.port=$PORT

