package com.company;

public class FornitureDecorator implements Forniture {

    Forniture forniture;

    public FornitureDecorator(Forniture forniture) {
        this.forniture = forniture;
    }

    @Override
    public String getDescription() {
        return forniture.getDescription();
    }
    @Override
    public double getPrice() {
        return forniture.getPrice();
    }

    @Override
    public double getSize() {
        return forniture.getSize();
    }
}

