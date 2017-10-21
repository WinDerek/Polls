Spring Boot Example - A Website for Polls
========

Project Structure
--------
- Spring MVC: Handling web requests
- Spring Data JPA: Persisting data to the database(An embedded H2 database)

API Specification
--------
Base URL: `localhost:6789`

1. - URL: `/polls`
   - Functionality: Returns a list of polls
   - Request Method: GET
   - Content-Type: `application/json;charset=UTF-8`

2. - URL: `/createPoll/{name}/{description}`
   - Functionality: Creates a new poll
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`

3. - URL: `/votePoll/{id}`
   - Functionality: Votes for a poll specified by the `id`
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`

4. - URL: `/deletePoll/{id}`
   - Functionality: Deletes a poll specified by the `id`
   - Request Method: POST
   - Content-Type: `application/json;charset=UTF-8`