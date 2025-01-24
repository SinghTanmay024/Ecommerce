# E-Commerce Backend with Java and Spring Boot

This is a full-featured backend for an e-commerce platform, built using **Java** and **Spring Boot**. It provides a secure, scalable, and modular solution for handling various e-commerce functionalities, such as user management, product catalog, order processing, and authentication.

## Features

- **Spring Boot Integration**: Simplifies application setup and development.
- **Database Support**: Uses **MySQL** with Spring Data JPA for ORM and database interactions.
- **Authentication and Authorization**: Secure user authentication with **JWT** (JSON Web Token) and Spring Security.
- **Validation**: Implements server-side input validation using Spring Boot Validation.
- **Model Mapping**: Efficient DTO to Entity mapping using **ModelMapper**.
- **API Testing**: Preconfigured **Spring Boot Test** framework for unit and integration testing.
- **Health Checks and Monitoring**: Actuator integration for monitoring and health checks.
- **Lombok**: Reduces boilerplate code with annotations for getters, setters, etc.

## Dependencies

This project uses the following dependencies:

- `spring-boot-starter-web`
- `spring-boot-starter-validation`
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-security`
- `spring-boot-starter-actuator`
- `mysql-connector-j`
- `lombok`
- `modelmapper`
- `jjwt-api`, `jjwt-impl`, and `jjwt-jackson` (for JWT authentication)
- `spring-security-core` and `spring-security-test` (for security and testing)

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 17 or later
- Maven
- MySQL Database

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-repo-name/ecommerce-backend.git
   cd ecommerce-backend
