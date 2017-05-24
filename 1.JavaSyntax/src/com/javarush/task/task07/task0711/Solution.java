package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stroki=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            stroki.add(sc.nextLine());
        }
        for(int i=0;i<13;i++)
        {
            String temp=stroki.get(4);
            stroki.remove(4);
            stroki.add(0,temp);

        }
        for(String s: stroki) System.out.println(s);
    }
}
