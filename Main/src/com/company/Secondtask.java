package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Secondtask {


    public static void task1() {
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
        System.out.println("------------");
    }

    public static void task2() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.println("Divided by 3:" + i);
            if (i % 5 == 0) System.out.println("Divided by 5:" + i);
            if (i % 5 == 0 && i % 3 == 0) System.out.println("Divided by 5 and 3:" + i);
        }
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = in.nextInt();
        System.out.print("Enter a number: ");
        int number2 = in.nextInt();
        System.out.print("Enter a number: ");
        int number3 = in.nextInt();
        if (number1 + number2 == number3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("------------");
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = in.nextInt();
        System.out.print("Enter a number: ");
        int number2 = in.nextInt();
        System.out.print("Enter a number: ");
        int number3 = in.nextInt();
        System.out.print("Enter a number: ");
        if (number2 > number1 && number3 > number2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void task5() {
        System.out.println("------------");
        int[] arr = new int[]{5, 6, 7, 3};
        System.out.println("Array " + Arrays.toString(arr));
        if (arr[0] == 3 || arr[(arr.length - 1)] == 3)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void task6() {
        System.out.println("------------");
        int[] arr = new int[]{5, 6, 7, 3};
        System.out.println("array " + Arrays.toString(arr));
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3)
                res = true;
        }
        System.out.println(res);
    }


}
