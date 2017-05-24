package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int a=sc.nextInt();
        if (a>0) count+=1;
        int b=sc.nextInt();
        if (b>0) count+=1;
        int c=sc.nextInt();
        if (c>0) count+=1;
        System.out.println(count);

    }
}
