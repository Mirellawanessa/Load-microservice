<p align="center"><img src="https://github.com/Mirellawanessa/Load-microservice/blob/main/docs/icon.png?raw=true" height="25%" width="25%"> </p>

 > ℹ️ **NOTE:** This repository was developed during a technical course on the [DIO](https://dio.me) platform.


# Load Simulator Microservice

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=jaimedantas_load-microservice&metric=alert_status)](https://sonarcloud.io/dashboard?id=jaimedantas_load-microservice)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=b3-tax-calculator&metric=coverage)](https://sonarcloud.io/dashboard?id=b3-tax-calculator)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=jaimedantas_load-microservice&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=jaimedantas_load-microservice)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=jaimedantas_load-microservice&metric=security_rating)](https://sonarcloud.io/dashboard?id=jaimedantas_load-microservice)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=jaimedantas_load-microservice&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=jaimedantas_load-microservice)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=jaimedantas_load-microservice&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=jaimedantas_load-microservice)

This microservice simulates a microservice with a REST endpoint at ``/resource/{resource_id}``.

## Languages and frameworks
 - Kotlin 1.4.30
 - Micronaut Framework 2.4.1
 - Swagger UI
 
## Libraries
 - [Java Fluent Validator](https://github.com/mvallim/java-fluent-validator)
 
## Requirements
- JDK 11
- Gradle 6.8.3

## Building From Source
To build from source checkout the code and run:
```
$ gradle clean build
```
## Run
To run the microservice, run:
```
$ java -jar load-simulator-0.1.jar
```
## Documentation
Swagger UI is used for documentation. You can find the information accessing its webpage at:
```
http://localhost:8080/swagger/views/swagger-ui/
```

## Configuration
The ``processing-time`` property in the``application.yml`` defines the average processing time of each HTTP
request in ms. The minimum value for the processing time is 50ms. You can also define the number of threads and the response
message. 

```
micronaut:
    processing-time: 100
    threads: 2
    return-message: Hello World!
```
## 👩‍💻 Expert

<p>
    <img 
      align=left 
      margin=10 
      width=80 
      src="https://github.com/Mirellawanessa/Load-microservice/blob/main/docs/162898256.jpeg?raw=true"
    />
    <p>&nbsp&nbsp&nbspMirella Wanessa<br>
    &nbsp&nbsp&nbsp
    <a href="https://github.com/Mirellawanessa">
    GitHub</a>&nbsp;|&nbsp;
    <a href="https://www.linkedin.com/in/mirellawanessa/">LinkedIn</a>
&nbsp;|&nbsp;
    <a href="https://www.instagram.com/_mirella.page/?next=%2F">
    Instagram</a>
&nbsp;|&nbsp;</p>
</p>
<br/><br/>
<p>

---

⌨️ with 💜 by [Mirella Wanessa](https://github.com/Mirellawanessa)
