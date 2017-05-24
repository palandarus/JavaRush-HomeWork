package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int min=0,max=0;
        for(int i=0;i<10;i++)
        {
            list.add(sc.nextLine());
            if(i==0) min=list.get(0).length();
            if(max<=list.get(i).length()) max=list.get(i).length();
            if(min>=list.get(i).length()) min=list.get(i).length();
        }
        for(String s: list)
        {
            if(s.length()==min)
            {
                System.out.println(s);
                break;
            }
            if(s.length()==max)
            {
                System.out.println(s);
                break;
            }
        }
    }
}
