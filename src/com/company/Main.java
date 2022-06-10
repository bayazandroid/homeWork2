package com.company;

public class Main {

    public static void main(String[] args) {
        Phone[] phones = {creteObject("Redmi"), creteObject("Samsung"), creteObject("Iphone"), creteObject("Vivo")};
        for (int i = 0; i < phones.length; i++) {
            phones[i].print();
        }

    }

    public static Phone creteObject(String className) {
        if ("Redmi".equals(className)) {
            Redmi redmi = new Redmi("redmi", " ips", " snapdragon");
            return redmi;
        } else if ("Samsung".equals(className)) {
            Samsung samsung = new Samsung("a31 ", 300, " superPhone");
            return samsung;
        } else if ("Iphone".equals(className)) {
            Iphone iphone = new Iphone( 20, " super");
            return iphone;
        } else if ("Vivo".equals(className)){
            Vivo vivo = new Vivo("Vivo", " Power",  2020,   200);
            return vivo;
        }
        return null;
    }
}
