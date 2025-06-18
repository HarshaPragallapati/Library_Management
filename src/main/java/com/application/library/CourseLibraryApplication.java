package com.application.library;

import com.application.library.entity.Author;
import com.application.library.entity.Book;
import com.application.library.entity.Category;
import com.application.library.entity.Publisher;
import com.application.library.service.BookService;
import io.github.cdimascio.dotenv.Dotenv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseLibraryApplication {

    private static final Logger logger = LoggerFactory.getLogger(CourseLibraryApplication.class);

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

        SpringApplication.run(CourseLibraryApplication.class, args);
    }

    @Bean
    public CommandLineRunner initialCreate(BookService bookService) {
        return (args) -> {
            logger.info("Seeding initial book data...");

            bookService.createBook(createNewBook("ABC", "Business Strategies", "Guide to business",
                    "John Smith", "Business Author", "Business", "Biz Pub"));

            bookService.createBook(createNewBook("ABC1", "Physics Today", "Modern physics concepts",
                    "Alice Newton", "Science Author", "Science", "Science Pub"));

            bookService.createBook(createNewBook("ABC21", "The Lost World", "Fictional journey",
                    "Arthur Doyle", "Fiction Writer", "Fiction", "Fiction House"));
        };
    }

    private Book createNewBook(String code, String name, String description,
                            String authorName, String authorDesc,
                            String categoryName, String publisherName) {
        Book book = new Book(code, name, description);
        Author author = new Author(authorName, authorDesc);
        Category category = new Category(categoryName);
        Publisher publisher = new Publisher(publisherName);
        book.addAuthor(author);
        book.addCategory(category);
        book.addPublisher(publisher);
        return book;
    }
}
