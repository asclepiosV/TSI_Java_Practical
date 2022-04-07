package com.isep.practical4.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private  BookRepository bookRepository;
    @GetMapping(path = "/*")
    public ResponseEntity<String> error() {
        return new ResponseEntity<>("<h1>Error 404</h1>" +
                "<a href=\"/getBooks\">Get all books</a>"+
                " or "+
                "<a href=\"/getBook?id=1\">Get first book</a>", HttpStatus.NOT_FOUND);
    }
    @GetMapping(path="/getBooks")
    public ResponseEntity<Iterable<Book>> getBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/getBook")
    public ResponseEntity<Optional<Book>> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(bookRepository.findById(id), HttpStatus.OK);
    }

}
