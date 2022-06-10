package com.company;

public class Iphone extends Phone {
    private int number;
    private String quality;

    public Iphone(int number, String quality) {
        this.number = number;
        this.quality = quality;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Iphone parametrs-->"+number+quality);

    }
}
