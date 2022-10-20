# Spring AOT demo application

A Spring Boot project running on native-image, using traditional three tier architecture.

Uses Spring WebMVC for the web layer, and Spring Data JDBC with a PostgreSQL database as storage layer.

## How to run

1. Start a PostgreSQL
   database: `docker run --rm -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user postgres`
1. Run the application: `./gradlew bootRun`
1. Insert some authors: `curlie POST :8080/author name=Moritz`
1. Insert some authors: `curlie POST :8080/author name=Andy`
1. Query the authors: `curlie :8080/author`

## How to run as a native-image

*Note*: You need at least GraalVM 22.3 for this to work.

1. Build native image: `./gradlew nativeCompile`
1. Start a PostgreSQL
   database: `docker run --rm -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user postgres`
1. Run the application: `build/native/nativeCompile/native-image-demo`
1. Insert some authors: `curlie POST :8080/author name=Moritz`
1. Insert some authors: `curlie POST :8080/author name=Andy`
1. Query the authors: `curlie :8080/author`

## How to run in AOT mode

1. Build application: `./gradlew build`
1. Start a PostgreSQL
   database: `docker run --rm -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user postgres`
1. Run the application: `java -Dspring.aot.enabled=true -jar build/libs/native-image-demo-0.0.1-SNAPSHOT.jar`
1. Insert some authors: `curlie POST :8080/author name=Moritz`
1. Insert some authors: `curlie POST :8080/author name=Andy`
1. Query the authors: `curlie :8080/author`
