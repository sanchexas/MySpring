package com.sanchez.context.Homework;

import com.sanchez.context.AppConfig;
import javafx.application.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyCart {

    public Product findById(Long id){

        return new Product(3L,"Морковь",50);
    }
}
