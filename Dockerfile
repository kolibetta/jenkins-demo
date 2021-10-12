FROM openjdk:8
EXPOSE 8095
ADD target/demo-jenkins-0.0.1-SNAPSHOT.jar demo-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/demo-jenkins-0.0.1-SNAPSHOT.jar"]