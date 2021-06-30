package com.sanchez.context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //данная аппликация очень интересна.
public class Car {
    String color;
    int speed;
    String mark;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public Car(){
        this.color = "BLUE";
        this.speed = 40;
        this.mark = "FA23";
    }
}
