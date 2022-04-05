package com.isep.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/getProducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/getProduct")
    public Optional<Product> getBook(
            @RequestParam(
                    value = "id",
                    defaultValue = "1") Long id){
        return productRepository.findById(id);
    }
}
