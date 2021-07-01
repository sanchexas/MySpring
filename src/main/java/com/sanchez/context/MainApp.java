package com.sanchez.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.findById(1L); //находим юзера по айдишнику
        System.out.println(user);
//        Box box = applicationContext.getBean("box",Box.class);
//        System.out.println(box.getColor());
//        System.out.println("_______________________________________________________");
//        Car car = applicationContext.getBean(Car.class);
//        Car car2 = applicationContext.getBean(Car.class);
//        car2.setColor("RED");
//        System.out.println(car.getColor());
//        System.out.println(car.getSpeed());
//        System.out.println(car.getMark());
//        System.out.println(car2.getColor());
//        System.out.println(car2.getSpeed());
//        System.out.println(car2.getMark());

        applicationContext.close();
    }
}
