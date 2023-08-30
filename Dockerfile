FROM eclipse-temurin:17
COPY target/dev.jar dev.jar
CMD ["java","-jar","dev.jar"]
