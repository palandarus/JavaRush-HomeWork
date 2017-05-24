package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=-1;
        int z=0;
        while(z!=-1)
        {
            i+=z;
            j++;
            z=sc.nextInt();

        }

        System.out.println((double)i/j);
    }
}

