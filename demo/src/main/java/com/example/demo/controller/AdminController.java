package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class AdminController {
    @Autowired
    public ProductService productService;

    @GetMapping(value = "/product")
    public List<Product> viewProduct(){
        return productService.getAll();
    }
    @GetMapping(value = "/product/{id}")
    public Product viewProductById(@PathVariable(value = "id") String id){
        return productService.getById(id);
    }
    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product){
        productService.saveProduct(product);
        return product;
    }
    @PutMapping(value = "/product/{id}")
    public Product updateProduct(@Valid @PathVariable(value = "id") String id, @RequestBody Product product){
        product.setId(id, product);
        return productService.saveProduct(product);
    }
    @DeleteMapping(value = "/product/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
