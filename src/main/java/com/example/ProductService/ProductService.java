package com.example.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductByID(int id) {
        System.out.println(id);
        return repo.findById(id);

    }
}
