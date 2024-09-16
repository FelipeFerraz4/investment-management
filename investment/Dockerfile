FROM maven:latest AS build

WORKDIR /app

COPY pom.xml .
COPY src src

RUN mvn package -DskipTests

# Stage para execução da aplicação
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]