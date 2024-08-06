package com.marek.onlinebookstore;

import com.marek.onlinebookstore.entity.Book;
import com.marek.onlinebookstore.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.math.BigDecimal;

@SpringBootApplication
public class OnlineBookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineBookStoreApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BookService bookService) {
        return args -> {
            bookService.save(new Book(null, "Book Title 1", "Author 1", "ISBN001",
                    new BigDecimal("9.99"), "Description 1", "cover1.jpg"));
            bookService.save(new Book(null, "Book Title 2", "Author 2", "ISBN002",
                    new BigDecimal("19.99"), "Description 2", "cover2.jpg"));
        };
    }
}
