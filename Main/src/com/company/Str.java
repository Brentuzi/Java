package com.company;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {



    public static void ex1(String str) {
        String[] stringArr = str.split(" ");
        int count = 0;
        String word = new String();
        for (String s : stringArr) {
            if (s.length() > count) {
                word = s;
                count = s.length();

            }
        }
        System.out.println("Most long word \"" + word + "\", had " +
                count + "letters");
    }

    public static void ex2(String strk) {
        strk = strk.replaceAll(" ", "");
        String[] str = strk.toLowerCase().split("");
        boolean result = false;
        for (int i = 0; i < strk.length() / 2; i++) {
            if (str[i].equals(str[strk.length() - 1 - i]))
                result = true;

            else {
                result = false;
                break;
            }

        }
        System.out.println(result ? "It's a palindrome" : "It's not a palindrome");
    }

    public static void ex2v2(String strk) {
        strk = strk.replaceAll(" ", "").toLowerCase();
        StringBuilder reverseString = new StringBuilder(strk).reverse();
        System.out.println(strk.equals(reverseString.toString()) ? "It's a palindrome" : "It's not a palindrome");
    }

    public static void ex3(String text, String cWord, String nword) {
        String newString = text.replaceAll(cWord, nword);
        System.out.println(newString);
    }

    public static void ex4(String text, String word) {

        String[] str = text.toLowerCase().split(" ");
        int count = 0;
        for (String i : str) {
            if (word.equals(i))
                count++;
        }
        System.out.println("Words " + word + " in texts we see count" + count );
    }

    public static void ex4R(String text, String word) {

        String str = text.toLowerCase();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println(count);
    }

    public static void ex5(String text) {
        System.out.println("The given string is: " + text);
        String[] str = text.split(" ");
        StringBuilder revText = new StringBuilder();
        for (String i : str) {
            revText.append(new StringBuilder(i).reverse()).append(" ");
        }
        System.out.println("The string reversed word by word is: ");
        System.out.println(revText);
    }

}
