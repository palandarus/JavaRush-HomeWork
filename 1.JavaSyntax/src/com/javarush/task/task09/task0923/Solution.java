package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String incomming=sc.nextLine();
        String gl="",sgl="";
        for (int i = 0; i < incomming.length(); i++) {
            if(isVowel(incomming.charAt(i))) gl+=incomming.charAt(i)+" ";
            else if(incomming.charAt(i)!=32)sgl+=incomming.charAt(i)+" ";
        }
        System.out.println(gl);
        System.out.println(sgl);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}