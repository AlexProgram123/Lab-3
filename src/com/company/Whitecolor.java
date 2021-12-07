package com.company;

public class Whitecolor extends FornitureDecorator{
    public Whitecolor(Forniture forniture) {
        super(forniture);
    }

    public String getDescription() {
        return super.getDescription() + " Color: White";
    }
}
