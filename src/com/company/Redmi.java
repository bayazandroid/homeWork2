package com.company;

public class Redmi extends Phone{
    private  String monitor ;
    private String processor;

    public Redmi(String name, String monitor, String processor) {
        super(name);
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Redmi parameter"+monitor+processor);
    }
}
