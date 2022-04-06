package com.company;

public class Car {

    private String color;
    private String brand;
    private int weight;

    public Car (String c, String b, int w){
        color = c;
        brand = b;
        weight = w;
    }
    // конструкторы
    public String result (String c){
        String part = "Color :" + c + ".";
        return part;
    }

    public String result (String c, int w){
        String part = "Color: " + c + ", weight " + w + ".";
        return part;
    }

    public void result (){
        System.out.println("Constructor");
    }


    public String All(){
        String all = "Color: " + color + ", make " + brand + ", weight " + weight;
        return all;
    }
}