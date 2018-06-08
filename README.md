# Readings back-end service

Tools needed to build application
---

1. Java 8
1. Docker (On windows it is recommended to use docker toolbox)

Deploy postgres database in docker
---

1. Start docker
1. Deploy postgres database: `docker run --name postgres-db -p 32768:5432 -e POSTGRES_PASSWORD=postgres -d postgres:latest`
1. Update application properties and specify postgres IP, port and password (i.e. on docker toolbox Ip by default should be 192.168.99.100)

Run application locally
---

1. To run application locally, run main method from  `ReadingsBeApplication.java` or from command line `gradlew build && java -jar build/libs/readings-be-0.0.1-SNAPSHOT.jar`

Run application in docker
---

1. build docker image: `./gradlew build docker`
1. Run built docker image: `docker run --name app -d -p 8080:8080 lv.proto/readings-be:latest`

Access application
---
1. Application on windows with docker toolbox should be available with teh following URL: `http:192.168.99.100:8080/partners`