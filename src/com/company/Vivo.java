package com.company;

public class Vivo extends Phone {
    private  String character;
    private  Integer  yearPhone;
    private Integer numberPhone;

    public Vivo(String name, String character, Integer yearPhone, Integer numberPhone) {
        super(name);
        this.character = character;
        this.yearPhone = yearPhone;
        this.numberPhone = numberPhone;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Vivo"+character+yearPhone+numberPhone);
    }
}
