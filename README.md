# blog-spring-boot-docker
A Dockerized Spring Boot Application

## Build Application
```
./gradlew clean build
```

## Create Docker image for executable jar
```
docker build -t exceptionly/demo .
```

## Swagger documentation
```
You can access the Swagger documentation from the link below.
http://localhost:8080/swagger-ui/index.html#
```