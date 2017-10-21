Spring Boot Example - A Website for Polls
========

Project Structure
--------
- Spring MVC: Handling web requests
- Spring Data JPA: Persisting data to the database(An embedded H2 database)

API Specification - CRUD
--------
Base URL: `localhost:6789`

1. **R(Retrieve)**
   - URL: `/polls`
   - Functionality: Returns a list of polls
   - Request Method: GET
   - Content-Type: `application/json;charset=UTF-8`

2. **C(Create)**
   - URL: `/createPoll/{name}/{description}`
   - Functionality: Creates a new poll and returns the created poll
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`

3. **U(Update)**
   - URL: `/votePoll/{id}`
   - Functionality: Votes for a poll specified by the `id` and returns the voted poll
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`

4. **D(Delete)**
   - URL: `/deletePoll/{id}`
   - Functionality: Deletes a poll specified by the `id` and returns a list of all the polls
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`

Build from Scratch
--------
1. Initialize a Spring Boot project
   - [http://start.spring.io](http://start.spring.io)
   - [Spring Initializr](https://github.com/spring-io/initializr)
   - `spring init -dweb,data-jpa,h2,thymeleaf --build maven directory_name`

2. Change the port
   - src/main/resources/application.properties
   - `server.port = 6789`

3. Structure your code
   - domain
   - service
   - web

4. Focusing on your application functionality