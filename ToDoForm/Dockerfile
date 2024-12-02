

FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn -f /ToDoForm/pom.xml <goals> ...
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
COPY --from=build /target/ToDoForm-0.0.1-SNAPSHOT.jar ToDoForm.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ToDoForm.jar"]
