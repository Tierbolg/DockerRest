# Use an official OpenJDK runtime as a parent image
#FROM openjdk:7
#FROM openjdk:8-jre-alpine
FROM openjdk:8-jdk-alpine
# set shell to bash
# source: https://stackoverflow.com/a/40944512/3128926
# Alpine docker image doesn't have bash installed by default
#RUN apk update && apk add bash
WORKDIR /opt/app
ARG JAR_FILE=target/docker-service1.jar
COPY ${JAR_FILE} app.jar
# Make port 9080 available to the world outside this container
EXPOSE 9080

# run application with this command line
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=default", "app.jar"]
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/docker-service1.jar"]



#CMD ["java","-jar","Service1"]
#ENTRYPOINT ["java","-jar","/app.jar"]

# Run jar file when the container launches
#CMD ["java", "-jar", "docker-service1.jar"]