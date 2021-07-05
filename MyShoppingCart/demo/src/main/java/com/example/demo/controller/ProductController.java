package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    public ProductService productService;

    @RequestMapping(value = {"/list-products"})
    public String viewProduct(Model model){
        model.addAttribute("listProduct" ,productService.getAll());
        return "list-product";
    }
    @RequestMapping(value = "/create-product")
    public String createProduct(Model model){
        model.addAttribute("product", new Product());
        return "create-product";
    }
    @RequestMapping(value ="/product-created")
    public String createdProduct(@ModelAttribute("Product") Product product, Model model){
        productService.saveProduct(product);
        model.addAttribute("listProduct" ,productService.getAll());
        return "list-product";
    }
    @RequestMapping(value = "/update-product/{id}")
    public String updateProduct(@PathVariable(value = "id") String id, Model model){
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "update-product";
    }

    @RequestMapping(value = "/product-updated")
    public String updatedProduct(@ModelAttribute("Product") Product product, Model model){
        productService.saveProduct(product);
        model.addAttribute("listProduct" ,productService.getAll());
        return "list-product";
    }

    @RequestMapping(value = "/delete-product/{id}")
    public String deleteProduct(@PathVariable("id") String id, Model model){
        productService.deleteProduct(id);
        model.addAttribute("listProduct" ,productService.getAll());
        return "list-product";
    }
}
