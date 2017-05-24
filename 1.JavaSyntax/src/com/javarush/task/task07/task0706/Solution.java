package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas=new int[15];
        int chet=0,nechet=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<mas.length;i++) mas[i]=sc.nextInt();
        for(int i=0;i<mas.length;i+=2)
        {
            chet+=mas[i];
            if(i!=14) nechet+=mas[i+1];
        }
        if(chet>nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
