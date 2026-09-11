FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY..
RUN./mvnw clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]