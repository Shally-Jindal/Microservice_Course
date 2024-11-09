# Start with an official OpenJDK 17 image as the base image
# Using the 'alpine' variant for a smaller image size
FROM openjdk:17-jdk-alpine

# Maintainer information - who maintains the image
MAINTAINER "eazybytes.com"

# Copy the JAR file from the target directory into the image
COPY ./target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Define the entry point for the container
# This will run the Java application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]