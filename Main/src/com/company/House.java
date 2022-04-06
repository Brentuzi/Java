package com.company;

import java.util.Scanner;

public class House {

    private int numberFlors;
    protected int buildDate;
    private String hosName;

    // метод ввода данные
    public void setPar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input counts floors");
        numberFlors = scanner.nextInt();
        System.out.println("Input date of built");
        buildDate = scanner.nextInt();
        System.out.println("Input house name");
        hosName = scanner.next();


    }

    // метод вывода всех значений

    public void showPar() {
        System.out.println("Information about house: \n");
        System.out.println("Count flors " + numberFlors);
        System.out.println("Date of built  " + buildDate);
        System.out.println("Name house  " + hosName);
    }


    public int ageHouse(int a, int b) {
        int result = b - a;
        return result;
    }
}