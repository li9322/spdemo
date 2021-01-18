package com.li.spdemo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DESCRIPTION:
 * @USER: li
 * @DATE: 2021/01/14 20:43
 */
@RestController
public class BookController {

    @Autowired
    Book book;

    @Autowired
    User user;


    @GetMapping("/book")
    public String book(){
        return book.toString();
    }

    @GetMapping("user")
    public String user(){
        return user.toString();
    }
}
