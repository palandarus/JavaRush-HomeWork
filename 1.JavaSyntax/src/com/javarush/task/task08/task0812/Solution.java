package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int Count=0,temp=1;

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
            if(i>0) {
                if (list.get(i) == list.get(i - 1)) temp += 1;
                else temp = 1;
            }
            if(Count<temp) Count=temp;
        }
        System.out.println(Count);

    }
}