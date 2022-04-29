package com.company;

import java.util.*;

public class exercise3 {
    public static void ex3() {
        List<Integer> arList = new ArrayList<Integer>();
        int i = 0;
        long startTimeArList = System.nanoTime();
        while (i < 1000000) {
            arList.add(i);
            i++;
        }
        long endTimeArList = System.nanoTime();
        long durationArList = (endTimeArList - startTimeArList);
        System.out.println("ArrayList - " + durationArList);

        List<Integer> linList = new LinkedList<Integer>();
        int j = 0;
        long startTimeLinList = System.nanoTime();
        while (j < 1000000) {
            arList.add(j);
            j++;
        }
        long endTimeLinList = System.nanoTime();
        long durationLinList = (endTimeLinList - startTimeLinList);


        System.out.println("LinkedList - " + durationLinList);
    }

    //ex4
    public static void ex4(Map map) {
        System.out.println("Input user name");
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("User: " + userName + "   Score: " + map.get(user));
                return;
            }
        }
        System.out.println("User not found");
        return;
    }

}
