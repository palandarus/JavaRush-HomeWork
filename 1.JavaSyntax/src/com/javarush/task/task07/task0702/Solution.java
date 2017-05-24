package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stroki=new String[10];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            if(i<8) stroki[i]=sc.nextLine();
            //else stroki[i]="";
        }
        for(int j=9;j>=0;j--)
        {
            System.out.println(stroki[j]);
        }
    }
}