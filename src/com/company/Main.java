package com.company;

public class Main {
    public static void main(String[] args) {
        int N = 100;
        Forniture[] allForniture = new Forniture[N];


        for(int i=0; i<allForniture.length; i++) {
            double a = Math.random();
            if(a<0.25) {
                allForniture[i] = new Location1(new Blackcolor(new Chair("",(Math.ceil(Math.random() * 10000)),100 + (Math.ceil(Math.random() * 100)))));
            }
            if(0.25<a & a<0.5) {
                allForniture[i] = new Location1(new Whitecolor(new Chair("",(Math.ceil(Math.random() * 10000)),(Math.ceil(Math.random() * 100)))));

            }
            if(0.5<a & a<0.75) {
                allForniture[i] = new Location2(new Blackcolor(new Chair("",(Math.ceil(Math.random() * 10000)),(Math.ceil(Math.random() * 100)))));
            }
            if(0.75<a) {
                allForniture[i] = new Location2(new Whitecolor(new Chair("",(Math.ceil(Math.random() * 10000)),(Math.ceil(Math.random() * 100)))));
            }
        }

        for(int i=0; i<allForniture.length; i++){
            System.out.println("chair №"+ (i + 1) + allForniture[i].getDescription() + " Height:" + allForniture[i].getSize() + " Price:" + allForniture[i].getPrice() + " Dollars");
        }
    }
}
