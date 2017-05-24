package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int[] mas=new int[3];
        int min=0;
        int max=0;
        int mid=0;
        int sum=0;
        for(int i=0;i<3;i++)
        {
            mas[i]=sc.nextInt();
            sum+=mas[i];
            if(i==0)
            {
                min=mas[i];
                max=mas[i];
                mid=mas[i];
            }
            else
            {
                if(min>mas[i]) min=mas[i];
                if(max<mas[i]) max=mas[i];
            }
        }
        mid=sum-max-min;
        System.out.println(mid);

    }

}
