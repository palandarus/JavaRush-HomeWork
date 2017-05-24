package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        char[] a=sc.nextLine().toCharArray();
        even=0;
        odd=0;
        for(char x:a)
        {
            if(x%2==0) even+=1;
            else odd+=1;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
