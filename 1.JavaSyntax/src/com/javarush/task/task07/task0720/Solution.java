package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());
        int temp=0;
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            if(M>i) list.add(reader.readLine());
            else list.add(i-M,reader.readLine());


        }
        for(String s:list) System.out.println(s);

    }
}
