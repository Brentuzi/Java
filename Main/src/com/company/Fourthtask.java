package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fourthtask {

    public static void task1() {
        int[] arr = new int[]{1, 6, 3, 4, 5};
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                result = true;
            else {
                result = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (result)
            System.out.println("OK");
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type lenght arr : ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.print("arr [" + (i + 1) + "]= ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void task3() {
        int[] arr = new int[]{1, 6, 3, 4, 5};
        int a;
        a = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = a;
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        int[] arr = new int[]{1, 2, 3, 1, 2, 5};
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j)
                    count++;
            }
            if (count == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    private static int[] mergeParts(int[] leftArr, int[] rightArr) {
        int[] resultArr = new int[leftArr.length + rightArr.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while (leftPoint < leftArr.length || rightPoint < rightArr.length) {
            if (leftPoint < leftArr.length && rightPoint < rightArr.length) {
                if (leftArr[leftPoint] < rightArr[rightPoint]) {
                    resultArr[resultPoint++] = leftArr[leftPoint++];
                } else
                    resultArr[resultPoint++] = rightArr[rightPoint++];
            } else if (rightPoint < rightArr.length)
                resultArr[resultPoint++] = rightArr[rightPoint++];
            else if (leftPoint < leftArr.length)
                resultArr[resultPoint++] = leftArr[leftPoint++];
        }
        return resultArr;
    }

    public static int[] splitArr(int[] arr) {


        if (arr.length < 2)
            return arr;
        int arrMid = arr.length / 2;
        int[] leftArr = new int[arrMid];
        int[] rightArr;
        if (arr.length % 2 == 0 || arrMid == 1)
            rightArr = new int[arrMid];
        else
            rightArr = new int[arrMid + 1];


        for (int i = 0; i < arrMid; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[arrMid + j];
        }
        System.out.println(Arrays.toString(leftArr));
        System.out.println(Arrays.toString(rightArr));
        //
        leftArr = splitArr(leftArr);
        rightArr = splitArr(rightArr);
        return mergeParts(leftArr, rightArr);
    }

    public static void task5() {
        int arrLength = 2 + (int) (Math.random() * 10);
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Random array:");
        System.out.println(Arrays.toString(arr));
        int[] newArr = splitArr(arr);
        System.out.println("seccesed array:");
        System.out.println(Arrays.toString(newArr));

    }
}











