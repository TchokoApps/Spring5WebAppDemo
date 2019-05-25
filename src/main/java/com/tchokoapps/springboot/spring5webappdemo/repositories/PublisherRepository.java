package com.tchokoapps.springboot.spring5webappdemo.repositories;

import com.tchokoapps.springboot.spring5webappdemo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
