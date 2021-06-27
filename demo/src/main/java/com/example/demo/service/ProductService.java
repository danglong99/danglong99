package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(String id);
    Product saveProduct(Product product);
    void deleteProduct(String id);
}
