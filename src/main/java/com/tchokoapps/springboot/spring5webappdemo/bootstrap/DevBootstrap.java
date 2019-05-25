package com.tchokoapps.springboot.spring5webappdemo.bootstrap;


import com.tchokoapps.springboot.spring5webappdemo.model.Author;
import com.tchokoapps.springboot.spring5webappdemo.model.Book;
import com.tchokoapps.springboot.spring5webappdemo.repositories.AuthorRepository;
import com.tchokoapps.springboot.spring5webappdemo.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric", "Evans");
        Book bookDDD = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(bookDDD);
        bookDDD.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(bookDDD);

        Author rod = new Author("Rod", "Johnson");
        Book bookNoEJB = new Book("J2EE Development without EJB", "23444", "Wrox");
        rod.getBooks().add(bookNoEJB);
        bookNoEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(bookNoEJB);
    }
}