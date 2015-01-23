spring-boot-example
===================

This example is mostly based off the tutorial on [spring.io]'s website.


Running and building
--------------------

To run the example with gradle: `gradle bootRun`

To build a single .jar file: `gradle build`

The resulting build will be located in `build/libs/`.


Dependencies and their uses
---------------------------

Java dependencies (specified in build.gradle):
- `org.springframework.boot`: For the base MVC framework
- `org.springframework.security`: For various security-related purposes, including authentication and hashing
- `org.springframework.session`: For user sessions
- `org.hibernate`: For interacting with the database via ORM, data persistence
- `junit`: For unit testing

Other software:
- MariaDB (or MySQL): Database for keeping data (`org.hibernate` will communicate with this)
- Redis: For session persistence (`org.springframework.session`), perhaps other caching purposes


Project structure
-----------------

Currently, the directory structure is as follows:

In `src/main/java/hello/`:
- `domain/` holds the models (or "entities"), directly related to the data stored in the database
- `form/` holds classes for storing form data
- `security/` holds classes for password hashing
- `web/` holds controllers

`src/main/resources/templates/` holds the views.


[spring.io]:https://spring.io/guides/gs/serving-web-content/
