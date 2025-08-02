


![Java](https://github.com/HakumenNC/logo-gallery/raw/v0.2.12/img/j/java/rectangle-b-1-40.png)
![Maven](https://github.com/HakumenNC/logo-gallery/raw/v0.2.12/img/m/maven/rectangle-b-1-40.png)
![Spring Boot](https://github.com/HakumenNC/logo-gallery/raw/v0.2.12/img/s/spring/rectangle-b-1-40.png)
![PostgreSQL](https://github.com/HakumenNC/logo-gallery/raw/v0.2.12/img/p/postgresql/rectangle-b-1-40.png)

# Agendix

Agendix is an agenda and appointment management application, built with Spring Boot, PostgreSQL, JWT, and MapStruct.

## Features

- JWT authentication (login, registration, secured endpoints)
- User, company, and appointment management
- RESTful API documentation (Swagger, Redoc)
- Advanced security (Spring Security, custom filters)
- DTO/Entity mapping with MapStruct
- Database migration with Liquibase

## Requirements

- Java 17+
- Maven
- PostgreSQL

## Installation

1. Clone the project:
   ```
   git clone https://github.com/HakumenNC/agendix.git
   cd agendix
   ```
2. Configure the database in 'src/main/resources/application.yml'.
3. Start the application:
   ```
   ./mvnw spring-boot:run
   ```

## API Documentation

- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## JWT Configuration

In 'application.yml':
```yaml
jwt:
  secret: 'your_secret_key'
  expiration: 6h
```

## Contributing

Contributions are welcome! Fork the project and open a pull request.
