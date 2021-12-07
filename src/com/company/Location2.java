package com.company;

public class Location2 extends FornitureDecorator{
    public Location2(Forniture forniture) {
        super(forniture);
    }

    public String getDescription() {
        return super.getDescription() + " Location: Location2";
    }
}
