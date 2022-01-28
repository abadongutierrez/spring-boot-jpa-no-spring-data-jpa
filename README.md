# ToDo App - Example of Spring Boot App and JPA without Spring Data JPA Starter

Look at the pom.xml to see which other dependencies you need when not using spring-data-jpa. Also look at com.jabaddon.springboot.todoapp.TodoAppApplication
to see which other Beans you need to declare.

## Start db

Inside the `docker` folder:

```
docker-compose -f postgresql.yml up -d
```

```
docker-compose -f postgresql.yml down
```
