package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        String[] words=getTokens("level22.lesson13.task01", ".");
        for (String word: words) {
            System.out.println(word);
        }
    }
    public static String [] getTokens(String query, String delimiter) {

        ArrayList<String> list=new ArrayList<>();
        StringTokenizer x=new StringTokenizer(query,delimiter);
        while (x.hasMoreTokens()){
            list.add(x.nextToken());
        }

        return list.toArray(new String[list.size()]);
    }
}
