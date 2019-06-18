# Spring Boot Docker Compose Example

Two simple Spring Boot applications, one acts as frontend one as backend. The frontend application is accessible via HTTP, 
the backend part thanks to Docker Compose not for everyone ;)


## Run it
Just run Docker Compose to build and start the containers: 
```
docker-compose up --build
```

## Test it
Just send a HTTP GET request to ``http://localhost:8080`` to see an output.