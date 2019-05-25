package com.tchokoapps.springboot.spring5webappdemo.repositories;

import com.tchokoapps.springboot.spring5webappdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
