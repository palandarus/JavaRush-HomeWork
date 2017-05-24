package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        String i="0";
        while(!i.equals("сумма"))
        {

            sum+=Integer.parseInt(i);
            i=sc.nextLine();
        }
        System.out.println(sum);
    }
}
