package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main() {
        //сканируем ввод и выбираем тип действия
        Scanner scan = new Scanner(System.in);

        System.out.println("Intput type of date : int, long, double:");

        String numbType = scan.nextLine();
        int x = 0;
        System.out.println("Input first number");
        int numb1 = scan.nextInt();
        System.out.println("Input second number");
        int numb2 = scan.nextInt();
        switch (numbType) {
            case ("int"):
                x = 1;
                break;
            case ("long"):

                x = 2;
                break;
            case ("double"):
                x = 3;
                break;
            default:
        }
                System.out.println("Error input");
                System.out.println("Input operation" +
                        "+," +
                        "-, " +
                        "*," +
                        "/");
                Scanner scan1 = new Scanner(System.in);
                String actionType = scan1.nextLine();

                switch (actionType) {
                    case ("+"):
                        if (x == 1) sumI(numb1, numb2);
                        if (x == 2) {
                            long n1 = numb1;
                            long n2 = numb2;
                            sumL(numb1, n2);
                        }
                        if (x == 3) {
                            sum(numb1,numb2 );
                        }


                        break;
                    case ("-"):
                        if (x == 1) subI(numb1, numb2);
                        if (x == 2) {
                            long n1 = numb1;
                            long n2 = numb2;
                            subL(numb1, n2);
                        }
                        if (x == 3) {
                            sum(numb1,numb2 );
                        }

                        break;
                    case ("*"):
                        if (x == 1) multiI(numb1, numb2);
                        if (x == 2) {
                            long n1 = numb1;
                            long n2 = numb2;
                            multiL(numb1, n2);
                        }
                        if (x == 3) {
                            multi(numb1,numb2 );
                        }

                        //break;
                    case ("/"):

                        if (x == 1) divI(numb1, numb2);
                        if (x == 2) {
                            long n1 = numb1;
                            long n2 = numb2;
                           divL(numb1, n2);
                        }
                        if (x == 3) {
                            div(numb1,numb2 );
                        }

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

    public static void divI(long a, long b) {
        System.out.println(a / b);
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
        System.out.println(a / b);
    }
}