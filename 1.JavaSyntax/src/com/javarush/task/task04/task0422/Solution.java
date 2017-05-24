package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String result="Подрасти еще";
        String name=String.valueOf(reader.readLine());
        int age=Integer.valueOf(reader.readLine());
        if(age<18) System.out.println(result); //test for git
    }
}
