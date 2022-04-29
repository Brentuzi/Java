package com.company;

import java.util.*;

public class Main {
    public static Set exercise2(List arList) {
        Set set = new HashSet();
        for (int i = 0; i < arList.size(); i++) {
            set.add(arList.get(i));
        }
        return set;
    }

    public static void main(String[] args) {

        List list = Arrays.asList(1, 2, 2, 3, 6, 5, 8, 9, 9, 12, 12, 58, 64, 4, 7, 7, 9);

        System.out.println(exercise2(list));
        exercise3.ex3();


        System.out.println("--------");
        User brent = new User();
        brent.setName("Brent");
        Map<User, Integer> gamePoints = new HashMap<>();
        gamePoints.put(brent, 300);
        exercise3.ex4(gamePoints);


    }


}
