package com.company;

public class Chair implements Forniture{
    String desctiption;
    double price;
    double size;

    public Chair(String desctiption, double price, double size){
        this.price = price;
        this.desctiption = desctiption;
        this.size = size;
    }
    public double getSize(){
        return this.size;
    };

    public double getPrice(){
        return this.price;
    };

    public String getDescription(){
        return this.desctiption;
    };
}
