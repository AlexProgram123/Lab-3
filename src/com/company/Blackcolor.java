package com.company;

public class Blackcolor extends FornitureDecorator{
    public Blackcolor(Forniture forniture) {
        super(forniture);
    }

    public String getDescription() {
        return super.getDescription() + " Color: Black";
    }
}