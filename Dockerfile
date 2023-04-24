FROM openjdk:11-jre-slim

WORKDIR /airlines

COPY target/*.jar /airlines/app.jar

EXPOSE 3000

CMD java -XX:+UseContainerSupport -jar app.jar

