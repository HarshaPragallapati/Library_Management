# Library Management System

A web-based library management system built with Java and Spring Boot. The system provides a simple interface to manage books, authors, categories, and publishers with full CRUD operations.

## Features

- **Book Management**
  - List all books in the library
  - View details for each book
  - Add new books, including ISBN, name, description, authors, categories, and publishers
  - Update existing book details
  - Delete books

- **Author Management**
  - List all authors
  - Add new authors with description
  - Update author details
  - Delete authors

- **Category Management**
  - List all categories
  - Add new categories
  - Update category names
  - Delete categories

- **Publisher Management**
  - (Available via similar CRUD endpoints, based on code structure)

## Technology Stack

- Java 17+
- Spring Boot (MVC)
- Spring Data JPA (with Hibernate)
- Maven (dependency management)
- Thymeleaf (for HTML templating)
- MySQL (configurable, see application properties)
- Lombok (for concise Java entities)

## Getting Started

### Prerequisites

- Java 17 or newer
- Maven

### Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/HarshaPragallapati/Library_Management.git
   cd Library_Management
   ```

2. **Configure the environment variables:**
   - Copy `.env.sample` to `.env` and adjust database credentials as needed.

3. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```
   or
   ```sh
   mvn spring-boot:run
   ```

4. **Access the system:**
   - Open your browser and go to `http://localhost:8080`

### Usage

- Navigate to `/books`, `/authors`, `/categories` for management views.
- Use the UI to add, update, or remove books, authors, and categories.
- Books can be associated with multiple authors, categories, and publishers.

## Project Structure

```
src/main/java/com/application/library/
  controller/   # MVC controllers (BookController, AuthorController, etc.)
  entity/       # JPA entities (Book, Author, Category, Publisher)
  repository/   # Spring Data repositories
  service/      # Business logic and services
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License.

-