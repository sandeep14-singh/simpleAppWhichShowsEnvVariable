FROM openjdk:21
ENV INJECTED_ENV_VAR="some value in docker file"
WORKDIR /usr/src/appb
COPY ./target/simpleApp-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
