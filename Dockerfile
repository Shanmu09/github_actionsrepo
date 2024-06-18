FROM openjdk
EXPOSE 8080
ADD target/springboot-image-newversion.jar springboot-image-newversion.jar
ENTRYPOINT ["java", "-jar", "/springboot-image-newversion.jar"]