# About

This project is a set of examples with inline explanations
describing core topics of Spring Data JPA and Java Persistence API. If it was helpful, please leave a :star: :blush:.

## Contents and Project Structure

Project was divided into different packages focused on different 
aspects and topics of Spring Data JPA:

- `entity` - describes entity structure 
- `relationships` - examples of entity relationships,
relation ownership, presenting different approaches to model them
- `inheritance` - entity inheritance
- `repository` - focused on querying and modifying data
- `cascading` - all about different cascade approaches 
and their consequences in data modification
- `fetching` - different solutions to lazy and eager loading
- `transaction` - examples of transaction handling, levels of isolation, transaction propagation
- `storedProcedures`
- `criteriaAPI`
- `locking`

## How to run this?

Although **the real value in this project is code itself** with its comments,
you can run it using `docker compose up` in the project root directory and
after the container has started by executing `mvn package && java -cp target/spring-boot-data-jpa-1.0-SNAPSHOT.jar dev.k2.springbootdatajpademo.SpringBootDataJpaDemoApplication` command.

If you'd like to use in memory database such as H2, simply replace
postgres dependency for:

```
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
```
in `pom.xml` and remove all `spring.datasource.*` properties from
`application.properties` file. Then you can use `mvn:asdad` command to start the application.

### Looking at table structure in Postgresql

If you'd like to look at table structure that was created in Postgres,
 recommended way is to use a tool such as Jetbrains' DataGrip.

However, if you don't have anything like that or don't want to do it the easy way,
you can look directly in the docker container in these steps:
- Lookup your running postgres container id by running `docker ps` command
- Run `docker -it ...` to go into your container
- Once you're inside the container, run `asd`
- Now you can see all the tables