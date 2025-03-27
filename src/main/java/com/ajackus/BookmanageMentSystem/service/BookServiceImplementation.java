package com.ajackus.BookmanageMentSystem.service;

import com.ajackus.BookmanageMentSystem.entity.AvaliabilityStatusEnum;
import com.ajackus.BookmanageMentSystem.entity.BookEntity;
import com.ajackus.BookmanageMentSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class BookServiceImplementation implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookEntity saveBook(BookEntity book) {
        if(book.getId() ==null ||bookRepository.existsById(book.getId())){
            book.setId(generateUniqueId());
            book.setAvailabilityStatus(AvaliabilityStatusEnum.ACTIVE);
        }
        return bookRepository.save(book);
    }

    private Long generateUniqueId() {
        Long id;
        Random random = new Random();
        do {
            id = 100000L + random.nextInt(900000);
        } while (bookRepository.existsById(id));
        return id;
    }
}
