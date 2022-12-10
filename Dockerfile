FROM gradle:jdk19-alpine AS build
WORKDIR /home/gradle/project/
COPY . /home/gradle/project/
RUN gradle --no-daemon bootJar

FROM openjdk:19-jdk-slim
COPY --from=build /home/gradle/project/build/libs/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]