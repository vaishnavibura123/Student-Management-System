# Student-Management-System
### Requirements
* IntelliJIDEA
* ServerPort: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
### Steps to run the Project
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/
* Put specific end_points besides the port accordingly to run the project to access and modify the data
# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
## JSON
* JSON is a lightweight, language-independent, data interchange format. See http://www.JSON.org/ The files in this package implement JSON encoders/decoders in Java. It also includes the capability to convert between JSON and XML, HTTP headers, Cookies, and CDL. This is a reference implementation.
## MySQL
* MySQL JDBC driver.
## DataBase Design
I used MySQL database. I downloaded one Spring Boot Application from spring inializr by adding required dependencies. Created model for Cook, Recipe, Instructions. I used Java persistence API.Controller , Service and repository are created. I used Crud operations for retriving, upadating, deletiong and adding the data.
### Steps to run the Project
* Click on the Swagger URL which is pasted below and perform the operations
http://34.215.54.235:8080/swagger-ui/index.html#/
# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
## MySQL
* MySQL JDBC driver.
## Swagger
* It provide the UserInterface for all our API's. 
# Working.
* Student manaagement System Application is a Rest API application which is built by using spring boot as framework.
* This project consist of five models namely Student, Laptop,Course, Book and Address along with their corresponding dao classes, controller classes and service classes.
* Created Repository for StudentRepo, LaptopRepo, CourseRepo and BookRepo.
* Performed Annotation validation on all the Model class present in the MVC.
* Relationship between Models or tables are given accordingly, relationships among them(Ex: OneToOne, OneToMany, ManyToMany)
