package com.company;

import java.util.Scanner;

public class PaarentTask3 {

    private int number;


    public void setN() {
        System.out.print("Input number: ");
        System.out.print("");
        Scanner scanData = new Scanner(System.in);
        number = scanData.nextInt();
    }

    public int getN() {
        return number;
    }

}
