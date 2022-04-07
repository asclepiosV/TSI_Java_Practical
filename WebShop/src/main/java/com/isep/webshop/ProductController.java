package com.isep.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/*")
    public ResponseEntity<String> error(){
        return new ResponseEntity<>("<h1>Error 404</h1>" +
                "<a href=\"/getProducts\">Get all products</a>"+
                " or "+
                "<a href=\"/getProduct?id=1\">Get first product</a>", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path="/getProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping(path="/getProduct")
    public ResponseEntity<Optional<Product>>getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return new ResponseEntity<>(productRepository.findById(id), HttpStatus.OK);
    }
}
