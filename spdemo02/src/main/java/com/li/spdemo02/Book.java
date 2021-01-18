package com.li.spdemo02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @DESCRIPTION:
 * @USER: li
 * @DATE: 2021/01/14 20:40
 */
@Component
//@PropertySource("classpath:book.properties")
@ConfigurationProperties(prefix = "book")
public class Book {
//    @Value("${book.name}")
    private String name;
//    @Value("${book.author}")
    private String author;
//    @Value("${book.price}")
    private Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
