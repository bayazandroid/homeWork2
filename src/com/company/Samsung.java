package com.company;

public class Samsung extends Phone{
    private Integer number ;
    private String quality ;

    public Samsung(String name, Integer number, String quality) {
        super(name);
        this.number = number;
        this.quality = quality;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Samsung parameter"+number+quality);
    }
}
