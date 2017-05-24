package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=sc.nextInt();
        while (count>0)
        {
            System.out.println(a);
            count-=1;
        }

    }
}
