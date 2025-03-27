package com.ajackus.BookmanageMentSystem.Controller;

import com.ajackus.BookmanageMentSystem.entity.BookEntity;
import com.ajackus.BookmanageMentSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("savebook")
    public BookEntity saveBook(@RequestBody BookEntity book){
        return bookService.saveBook(book);
    }
}
