package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0; int summ = 0;
        Scanner sc=new Scanner(System.in);
        while (i != (-1))
        {
            int b = sc.nextInt();
            i = b;
            summ = summ + b ;
        }

        System.out.println(summ);
    }
}
