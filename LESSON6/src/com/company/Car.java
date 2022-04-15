package com.company;

public class Car {
    public String model;
    public String modelCount;
    public String color;
    public int maxSpeed;
    public int weight;
    public int maxWeight;
    public float oil;


    public void InfoCar() {
        System.out.println("Model: " + model + " model name: " + modelCount + " color: " + color);
        System.out.println("Max speed: " + maxSpeed + " Weight: " + weight + " Max weight: " + maxWeight + " Oil: " + oil);
    }

    public Car(String model, String modelCount, String color, int maxSpeed, int weight, int maxWeight, float oil) {
        this.model = model;
        this.modelCount = modelCount;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.oil = oil;
    }

    public Car() {

    }

}
