# README.md for Cinema Zino Backend

# Cinema Zino Backend

Welcome to the Cinema Zino Backend project! This project is built using Spring Boot and provides a RESTful API for managing cinema-related functionalities.

## Project Structure

```
cinema-zino-backend
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cinemazino
│   │   │           ├── CinemaZinoApplication.java
│   │   │           ├── config
│   │   │           │   ├── JwtConfig.java
│   │   │           │   ├── RedisConfig.java
│   │   │           │   ├── SecurityConfig.java
│   │   │           │   └── CorsConfig.java
│   │   │           ├── controller
│   │   │           │   └── ApiController.java
│   │   │           ├── dto
│   │   │           │   ├── request
│   │   │           │   └── response
│   │   │           ├── entity
│   │   │           │   └── BaseEntity.java
│   │   │           ├── exception
│   │   │           │   ├── CustomException.java
│   │   │           │   └── GlobalExceptionHandler.java
│   │   │           ├── repository
│   │   │           │   └── BaseRepository.java
│   │   │           ├── security
│   │   │           │   ├── JwtAuthenticationFilter.java
│   │   │           │   └── JwtAuthenticationEntryPoint.java
│   │   │           ├── service
│   │   │           │   └── BaseService.java
│   │   │           └── util
│   │   │               └── CommonUtils.java
│   │   └── resources
│   │       └── application.yml
├── pom.xml
└── README.md
```

## Features

- JWT Authentication
- Redis Caching
- RESTful API Endpoints
- Exception Handling
- CORS Configuration

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd cinema-zino-backend
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

## Configuration

The application configuration can be found in `src/main/resources/application.yml`. Update the database, Redis, and JWT settings as needed.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.