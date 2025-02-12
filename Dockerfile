FROM openjdk:17
ARG JAR_FILE=$(ls build/libs/*.jar | grep -v plain | head -n 1)
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
