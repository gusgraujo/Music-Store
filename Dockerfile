FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8089
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar","/target/music-store.jar"]
