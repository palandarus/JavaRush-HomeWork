package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
//        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        String result = "";
        try {
            String[] s = string.split(" ");
            for (int i = 0; i < 4; i++) {
                result += s[i + 1] + " ";
            }
        }catch (Exception e){
            throw new TooShortStringException();
        }
        return result.trim();
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
