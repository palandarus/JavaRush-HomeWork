package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>0)
        {
            if(b>0) System.out.println("1");
            if(b<0) System.out.println("4");
        }
        if(a<0)
        {
            if(b>0) System.out.println("2");
            if(b<0) System.out.println("3");
        }
    }
}
