package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // нечетные числа от 1 до 99
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
        System.out.println("------------");
        //которые делятся на 3, 5 и на то и другое

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.println("Divided by 3:" + i);
            if (i % 5 == 0) System.out.println("Divided by 5:" + i);
            if (i % 5 == 0 && i % 3 == 0) System.out.println("Divided by 5 and 3:" + i);
        }
        System.out.println("------------");
        //3.	Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
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
        //4.4.	Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
        if (number2 > number1 && number3 > number2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //

        System.out.println("------------");
            int[] arr = new int[]{5, 6, 7, 3};
            System.out.println("Array " + Arrays.toString(arr));
            if (arr[0] == 3 || arr[(arr.length-1 )] == 3)
                System.out.println(true);
            else


                System.out.println(false);
            System.out.println("------------");
        int[] arr1 = new int[]{5, 6, 7, 3};
        System.out.println("array " + Arrays.toString(arr));
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3)
                res = true;
        }
        System.out.println(res );



    }
}
