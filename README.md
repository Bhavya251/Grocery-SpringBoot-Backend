# Grocery Spring Boot Backend

## Overview

This project is a backend service for a grocery price tracking application, built using Java and Spring Boot. It provides RESTful APIs for managing grocery price, items, stores, and categories.

## Features

- **Product Management**: CRUD operations for grocery items, stores & categories.
- **Database Integration**: Uses PostgreSQL for data storage.
- **Exception Handling**: Global exception handling for API responses.

## Technologies Used

- **Java 21**
- **Spring Boot 2.5**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- PostgreSQL

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Bhavya251/Grocery-SpringBoot-Backend.git
    cd Grocery-SpringBoot-Backend
    ```

2. **Configure the database**:
    - Update the `application.properties` file with your PostgreSQL database credentials.
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:3306/grocery_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
