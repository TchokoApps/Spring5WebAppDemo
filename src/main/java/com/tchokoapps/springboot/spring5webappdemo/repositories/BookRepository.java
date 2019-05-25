package com.tchokoapps.springboot.spring5webappdemo.repositories;

import com.tchokoapps.springboot.spring5webappdemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
