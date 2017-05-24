package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String filename=reader.readLine();
        InputStream file=new FileInputStream(filename);
            while(file.available()>0)
            {
                System.out.print((char)file.read());
            }
            reader.close();
            file.close();
        System.out.println();
        }


    }