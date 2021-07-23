FROM java:8
# EXPOSE 8080
RUN mkdir app
WORKDIR app
COPY .mvn .mvn
COPY mvnw mvnw
RUN chmod -R 755 mvnw
RUN ls -lh
COPY pom.xml pom.xml
RUN ./mvnw package -f pom.xml
COPY src src
RUN  ./mvnw package -f pom.xml
RUN mv target/*.jar target/app.jar
ENTRYPOINT ["java", "-jar","target/app.jar"]
