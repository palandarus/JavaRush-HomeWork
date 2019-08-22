package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                char a = string.charAt(i);
                if (a == '\t') count++;
            }
            if (count < 2) throw new TooShortStringException();
            return string.substring(string.indexOf("\t") + 1, string.indexOf("\t", string.indexOf("\t") + 1));
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {

        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
//        System.out.println(getPartOfString("\tJavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString(null));
    }
}
