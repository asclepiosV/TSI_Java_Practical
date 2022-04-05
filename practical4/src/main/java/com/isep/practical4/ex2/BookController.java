package com.isep.practical4.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private  BookRepository bookRepository;

    @GetMapping(path = "/getBooks")
    public Iterable<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/getBook")
    public Optional<Book> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return bookRepository.findById(id);
    }

}
