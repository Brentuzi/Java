package com.company;


public abstract class Human implements Bank {
    private String Name;
    private String lastName;

    public Human(String Name, String lastName) {
        this.Name = Name;
        this.lastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    abstract void getInfo();
}