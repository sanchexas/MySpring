package com.sanchez.context.Homework;

public class Product {
    private Long id;
    private String name;
    private int price;

    public Long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Product(Long id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return id + " " + name + " " + price;
    }
}
