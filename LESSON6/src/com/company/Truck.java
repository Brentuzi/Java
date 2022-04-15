package com.company;

public class Truck extends Car {
    public int wheels;
    public int height;


    public Truck(String model, String modelCount, String color, int maxSpeed, int weight, int maxWeight, float oil, int wheels, int height) {
        super(model, modelCount, color, maxSpeed, weight, maxWeight, oil);
        this.wheels = wheels;
        this.height = height;

    }

    public Truck() {
    }


    public void Wheel(int wheels) {
        if (this.wheels > 0) this.wheels = wheels;
        System.out.println("Count of wheels truck" + this.wheels);
    }
}
