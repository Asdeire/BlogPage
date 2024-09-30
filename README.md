# Blog Project

## Overview

This project is a simple blog application built using Spring MVC and Spring Boot. It implements a blogging system with two main entities: **Post** and **User**. Users can create, read, update, and delete blog posts. This project demonstrates the MVC architecture and includes features such as input validation, authentication, and authorization.

## Features

- **CRUD Functionality** for posts and users
- User authentication and authorization
- Input data validation
- Responsive design using HTML5 and Bootstrap
- MVC architecture using Spring

## Technologies Used

- **Java**: Programming language
- **Spring Boot**: Framework for building the application
- **Spring MVC**: To implement the MVC architecture
- **Thymeleaf**: For rendering HTML templates
- **Bootstrap**: For styling the web application
- **JUnit**: For unit testing
- **Maven**: For dependency management

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/blog-project.git
   cd blog-project
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8081`.

## Usage

- Navigate to `/posts` to view the list of blog posts.
- Use the `/posts/new` endpoint to create a new post.
- Click on a post to view details or edit it.
- Users can register and log in to create posts.

## Testing

To run the tests, use the following command:
```bash
mvn test
```

## Contributing

Contributions are welcome! Please fork the repository and create a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Framework](https://spring.io/)
- [Bootstrap](https://getbootstrap.com/)
- [Thymeleaf](https://www.thymeleaf.org/)
