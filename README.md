# Hello World Java Maven Project

A sample Hello World project in Java with Maven.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Build

```bash
mvn clean compile
```

## Run Tests

```bash
mvn test
```

## Run Application

```bash
mvn exec:java -Dexec.mainClass=com.example.HelloWorld
```

## Package

```bash
mvn package
java -jar target/hello-world-1.0-SNAPSHOT.jar
```
