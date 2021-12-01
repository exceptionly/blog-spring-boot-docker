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

## Run the dockerized application
```
docker run -p 8080:8080 exceptionly/demo
```