# FROM maven:3.8.5-openjdk-17 AS build
# #WORKDIR /app
# RUN mvn -f /pom.xml <> 
# RUN mvn dependency:go-offline -B
# COPY . .
# RUN mvn clean package -DskipTests

# FROM openjdk:17-jdk-slim
# #WORKDIR /app
# COPY --from=build /app/target/ToDoForm-0.0.1-SNAPSHOT.jar ToDoForm.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "ToDoForm.jar"]

# FROM maven:3.8.5-openjdk-17 AS build
# WORKDIR /app
# RUN mvn -f pom.xml clean install
# # Pre-fetch dependencies
# RUN mvn dependency:go-offline -B

# RUN mvn clean package -DskipTests
# # RUN mvn -f /ToDoForm/pom.xml <goal>
# #RUN mvn clean package -DskipTests
# FROM openjdk:17-jdk-slim
# COPY --from=build /target/ToDoForm.jar ToDoForm.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "ToDoForm.jar"]


FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . /app/
RUN mvn clean package

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/ToDoForm.jar app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
