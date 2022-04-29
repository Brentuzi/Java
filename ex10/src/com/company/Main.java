package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("C:/Users/Alex-/IdeaProjects/ex10/1.txt");
        File file2 = new File("C:/Users/Alex-/IdeaProjects/ex10/2.txt");
        File file3 = new File("C:/Users/Alex-/IdeaProjects/ex10/3.txt");
        File file4 = new File("C:/Users/Alex-/IdeaProjects/ex10/4.txt");
        String stroka = "stroka peredana";


        System.out.println("1.Задание читает текстовый файл и возвращает его в виде списка строк");
        Class.ex1(file1).forEach(System.out::println);

        System.out.println("--------------");
        System.out.println("2.Написать метод, который записывает в файл строку, переданную параметром");
        Class.ex2(file2, stroka);
        Class.ex1(file2).forEach(System.out::println);

        System.out.println("--------------");
        System.out.println("3.Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.");
        Class.ex3(file1, file2, file3);
        Class.ex1(file3).forEach(System.out::println);

        System.out.println("--------------");
        System.out.println("4.\tНаписать метод который заменяет в файле все не символьные знаки на знак $   ");
        Class.ex4(file4);
    }
}
