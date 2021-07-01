package com.sanchez.context.Homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    public List<Product> products;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Огурец", 20),
                new Product(2L, "Картофель", 15),
                new Product(3L, "Морковь", 50),
                new Product(4L, "Мука", 50),
                new Product(5L, "Помидор", 30)

        ));


    }

    public Product findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new RuntimeException("Продукт не найден");
    }
}

