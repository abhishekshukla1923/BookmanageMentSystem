package com.ajackus.BookmanageMentSystem.repository;

import com.ajackus.BookmanageMentSystem.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
