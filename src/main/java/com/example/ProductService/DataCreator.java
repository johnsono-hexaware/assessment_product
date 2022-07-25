package com.example.ProductService;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataCreator {

    @Autowired
    private ProductRepo repo;

    public void createData() {
        Product product1 = new Product(101, "Galaxy", 1200);
        Product product2 = new Product(202, "iPhone13", 1300);
        Product product3 = new Product(303, "Pixel", 900);

        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
    }
}
