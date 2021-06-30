package com.sanchez.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Box {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   @PostConstruct
    public void init(){
        this.color = "RED";
   }


}
