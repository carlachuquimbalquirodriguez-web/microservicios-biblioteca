FROM maven:3.9.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml ./pom.xml
COPY prestamos-service ./prestamos-service
RUN mvn -pl prestamos-service -am clean package -DskipTests
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/prestamos-service/target/prestamos-service-1.0.0.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]
