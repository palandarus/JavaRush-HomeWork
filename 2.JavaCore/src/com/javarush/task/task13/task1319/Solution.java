package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String filename=reader.readLine();
        BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
        String temp="";
        ArrayList<String> list=new ArrayList<String>();
        while(!temp.equals("exit"))
        {
            temp=reader.readLine();
            writer.write(temp+"\n");
        }
        reader.close();
        writer.close();
    }
}
