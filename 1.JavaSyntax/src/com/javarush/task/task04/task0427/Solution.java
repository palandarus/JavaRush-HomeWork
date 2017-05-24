package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a > 0 && a < 1000) {
            String result = a%2 == 0 ? "четное " : "нечетное ";
            result += a/100 > 0 ? "трехзначное " : a/10 > 0 ? "двузначное " : "однозначное ";
            System.out.println(result + "число");
        }

    }
}
