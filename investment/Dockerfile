# Use the official OpenJDK 17 image
FROM openjdk:17-jdk-alpine

# Install Maven since it's not included in the base image
RUN apk add --no-cache maven

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project file to the container
COPY pom.xml .

# Copy the source code to the container
COPY src ./src

# Run Maven build to compile the project and package it as a JAR file
RUN mvn clean package -DskipTests

# Copy the generated JAR file from the target directory to the container
COPY target/investment-0.0.1-SNAPSHOT.jar app.jar

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
