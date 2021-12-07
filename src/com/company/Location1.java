package com.company;

    public class Location1 extends FornitureDecorator{
        public Location1(Forniture forniture) {
            super(forniture);
        }

        public String getDescription() {
            return super.getDescription() + " Location: Location1";
        }
}
