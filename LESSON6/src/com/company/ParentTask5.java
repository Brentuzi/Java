package com.company;

import java.util.Scanner;

public class ParentTask5 {
    protected int age;
    Scanner scanner = new Scanner(System.in);

    public void setAll() {

        System.out.println("Input age");
        age = scanner.nextInt();

    }

    public void getInfo() {
        System.out.println("Age " + age);
    }


}