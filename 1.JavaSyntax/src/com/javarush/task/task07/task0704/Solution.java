package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<5;i++)
        {
            temp=arr[9-i];
            arr[9-i]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

