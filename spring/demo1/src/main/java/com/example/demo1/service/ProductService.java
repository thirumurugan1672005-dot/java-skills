package com.example.demo1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo1.model.Product;

@Service 
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> findAll(){
        return products;
    }
    public void addProduct(String name , double price){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        products.add(product);
        
    }
}
