FROM openjdk:8
EXPOSE 8081
ADD target/SpringBeanScopeTest-0.0.1-SNAPSHOT.jar SpringBeanScopeTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar" "/SpringBeanScopeTest-0.0.1-SNAPSHOT.jar" ]