package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo1.service.ProductService;

@Controller 
public class ProductController {

    private final ProductService productService;

    @Autowired 
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping ("/products")
    public String viewAllProducts(Model page){
         var products = productService.findAll();
         page.addAttribute("products",products);
         return "products.html";
    }

    @PostMapping ("/products")
    public String addProduct(@RequestParam  String name , @RequestParam  double price , Model page){
         productService.addProduct(name, price);
         var products = productService.findAll();
         page.addAttribute("products",products);
         return "products.html";
    }
}
