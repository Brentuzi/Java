package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main() {
        //сканируем ввод и выбираем тип действия
        Scanner scan = new Scanner(System.in);
        double numb1, numb2;
        int numbI1, numbI2;
        long numbL1, numbL2;

        System.out.println("Intput type of date : int, long, double:1 or 2 or 3");
        System.out.println("Intput type of date : 1      2      3");
        String numbType = scan.nextLine();
        int x=0;

        switch (numbType) {
            case ("1"):
                x = 1;
                break;
            case ("2"):

                x = 2;
                break;
            case ("3"):

                x = 3;
                break;
            default:
        }

        numbI1 = 0;
        numbI2 = 0;
        numbL1 = 0;
        numbL2 = 0;
        numb1 = 0;
        numb2 = 0;
        if (x == 1) {
            System.out.println("Input first number");
            numbI1 = scan.nextInt();
            System.out.println("Input second number");
            numbI2 = scan.nextInt();
        } else if (x == 2) {
            System.out.println("Input first number");
            numbL1 = scan.nextLong();
            System.out.println("Input second number");
            numbL2 = scan.nextLong();

        } else {
            System.out.println("Input first number");
            numb1 = scan.nextDouble();
            System.out.println("Input second number");
            numb2 = scan.nextDouble();
        }

        System.out.println("Input operation" +
                "+," +
                "-, " +
                "*," +
                "/");
        Scanner scan1 = new Scanner(System.in);
        String actionType = scan1.nextLine();

        switch (actionType) {
            case ("+"):
                if (x == 1) sumI(numbI1, numbI2);
                if (x == 2) sumL(numbL1, numbL2);
                if (x == 3) sum(numb1, numb2);
                break;
            case ("-"):
                if (x == 1) subI(numbI1, numbI1);
                if (x == 2) subL(numbL1, numbL2);
                if (x == 3) sub(numb1, numb2);
                break;
            case ("*"):
                if (x == 1) multiI(numbI1, numbI2);
                if (x == 2) multiL(numbL1, numbL2);
                if (x == 3) multi(numb1, numb2);

                break;
            case ("/"):
                if (x == 1) divI(numbI1, numbI2);
                if (x == 2) divL(numbL1, numbL2);
                if (x == 3) div(numb1, numb2);
                break;
            default:
                System.out.println("Error input");


        }
    }

    public static void sum(double q, double w) {
        System.out.println(q + w);

    }

    public static void sub(double a, double b) {
        System.out.println(a - b);
    }

    public static void multi(double a, double b) {
        System.out.println(a * b);
    }

    public static void div(double a, double b) {
        System.out.println(a / b);
    }

    public static void sumI(int a, int b) {
        System.out.println(a + b);

    }

    public static void subI(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiI(int a, int b) {
        System.out.println(a * b);
    }

    public static void divI(int a, int b) {
        System.out.println(0.1 * a / b);
    }

    public static void sumL(long a, long b) {
        System.out.println(a + b);

    }

    public static void subL(long a, long b) {
        System.out.println(a - b);
    }

    public static void multiL(long a, long b) {
        System.out.println(a * b);
    }

    public static void divL(long a, long b) {
        System.out.println(0.1*a / b);
    }
}