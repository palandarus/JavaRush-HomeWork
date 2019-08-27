package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        String[] words;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
//             BufferedReader file = new BufferedReader(new FileReader("C:/1.txt"))
        ) {
            words = file.readLine().split(" ");
            StringBuilder result = getLine(words);
            System.out.println(result.toString().trim());
//            System.out.println(getLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0) return new StringBuilder();
        StringBuilder result = new StringBuilder();
        ArrayList<StringBuilder> Variants = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Variants.add(new StringBuilder(getBestCombo2(excile(words, i), words[i]).toString().trim()));
        }
        int max = 0;
        for (int i = 0; i < Variants.size(); i++) {
            if (Variants.get(max).length() < Variants.get(i).length()) max = i;
//            System.out.println(Variants.get(i).toString());
        }
        result.append(Variants.get(max));
        for (int i = 0; i < words.length; i++) {
            if (result.indexOf(words[i]) == -1) result.append(" " + words[i]);
        }


        return result;
    }

    public static StringBuilder getBestCombo2(String[] words, String city) {
        StringBuilder citys = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        citys.append(city);
        for (int i = 0; i < words.length; i++) {
            if (joinable(city, words[i]) == 1) {
                if (words.length < 3) {
                    String temp = "";
                    if (i == 0) {
                        temp = " " + words[i];
                        if (joinable(words[i], words[i + 1]) == 1) temp += " " + words[i + 1];
                    }
                    if (i == 1) {
                        temp = " " + words[i];
                        if (joinable(words[i], words[i - 1]) == 1) temp += " " + words[i - 1];
                    }
                    list.add(temp);
                } else {
                    String temp = " " + getBestCombo2(excile(words, i), words[i]).toString();
                    list.add(temp);
                }
            }
        }
        if (list.size() > 0) {
            int max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).length() < list.get(i + 1).length()) max = i + 1;
            }
            citys.append(list.get(max));
        }
        return citys;
    }

    public static Character First(String word) {
        return word.toLowerCase().charAt(0);
    }

    public static Character Last(String word) {

        return word.toLowerCase().charAt(word.length() - 1);
    }

    public static int joinable(String word1, String word2) {
        int result = 0;

        if (Last(word1).equals(First(word2))) result = 1;
        else if (First(word1).equals(Last(word2))) result = -1;
        return result;
    }

    public static String[] excile(String[] words, int i) {

        String otherwords = " ";
        for (int k = 0; k < words.length; k++) {
            if (k != i) otherwords += words[k] + " ";
        }
        return otherwords.trim().split(" ");
    }

}
