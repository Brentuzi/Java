package com.company;

public class Tree {
    // переменные класса
    private int age;
    private boolean Live;
    private String name;

    // конструктор
    Tree(int a, String n){
        age = a;
        name = n;
        System.out.println("В конструктор переданы параметры:" +
                "\nAge = " + age +
                "\nName = " + name + "\n");
    }

    Tree(int a, boolean i, String n){
        age = a;
        Live = i;
        name = n;
        System.out.println("Параметры конструктора:" +
                "\nAge = " + age +
                "\nisLive = " + Live +
                "\nName = " + name + "\n");
    }

    Tree(){
        System.out.println("\nПустой конструктор без паратмеров \n");
    }
}
