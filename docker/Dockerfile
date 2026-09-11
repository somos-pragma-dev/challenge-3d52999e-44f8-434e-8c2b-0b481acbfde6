FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY. /app
RUN./mvnw package -DskipTests

FROM openjdk:21-jdk-slim AS runtime
COPY --from=build /app/target/ecommerce-api.jar /app/ecommerce-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ecommerce-api.jar"]