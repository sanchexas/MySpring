package com.sanchez.context.Homework;

import com.sanchez.context.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MyCart myCart = applicationContext.getBean(MyCart.class);

        Product product = myCart.findById(3L);
        System.out.println(product);

        applicationContext.close();
    }
}
