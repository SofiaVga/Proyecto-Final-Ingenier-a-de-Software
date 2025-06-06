# 
Proyecto Final: API REST de Películas

Este es el proyecto final de la materia de Ingeniería de Software. Se trata de una API REST construida con Spring Boot que permite gestionar una base de datos de películas, incluyendo operaciones CRUD completas, validaciones, excepciones personalizadas, y montado sobre un entorno **Docker multicontenedor**.

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3.5
- Maven
- MySQL 8
- Docker y Docker Compose
- Postman (para pruebas)
- JPA + Hibernate
- Bean Validation

---
## 🐳 Ejecución en Docker

### 1. Compilar el proyecto sin pruebas:
bash
./mvnw clean package -DskipTests

### 2. Levantar el entorno Docker:
bash
docker-compose up --build
---

## 📁 Estructura del proyecto
```
spring-api-peliculas/
├── Dockerfile
├── docker-compose.yml
├── mvnw
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/spring_api_peliculas/
│       │       ├── controller/
│       │       │   └── PeliculaController.java
│       │       ├── model/
│       │       │   └── Pelicula.java
│       │       ├── service/
│       │       │   ├── PeliculaService.java
│       │       │   └── PeliculaServiceImpl.java
│       │       ├── repository/
│       │       │   └── PeliculaRepository.java
│       │       ├── exception/
│       │       │   ├── GlobalExceptionHandler.java
│       │       │   └── RecursoNoEncontradoException.java
│       │       └── SpringApiPeliculasApplication.java
│       └── resources/
│           ├── application.properties
│           └── static/
└── README.md


---


