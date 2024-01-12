# Getting Started

### Bug explanation

Starting with Spring Boot 3.1.1, the `PATCH` method is no longer working properly.
This projet is a minimal example to reproduce the bug.
You can see the bug in action by running this command `./gradlew bootRun`.

### How to reproduce the bug
Import the `spring-data-rest-ano.postman_collection.json` file in Postman.
Go to the `PATCH` request and run it.
We try to update the `participants` field of the `programme` object.
We already have 2 `participants` and expect to have 4 `participants` field.
But we only have 3 `participants` field.

### How to reproduce normal behavior
Go to "build.gradle" and change the Spring Boot version to `3.1.0`.
Run `./gradlew bootRun` and run the `PATCH` request again.
This time, we have 4 `participants` field as expected.



