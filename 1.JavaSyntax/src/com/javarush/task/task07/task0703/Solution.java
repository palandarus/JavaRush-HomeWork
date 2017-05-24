package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stroki=new String[10];
        int[] chisla=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            String temp;
            temp=sc.nextLine();
            stroki[i]=temp;
            chisla[i]=temp.length();
        }
        for(int j : chisla)System.out.println(j);
    }
}
