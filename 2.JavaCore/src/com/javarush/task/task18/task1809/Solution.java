package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
//            FileInputStream file1 = new FileInputStream("C:/1.txt");
//            FileOutputStream file2 = new FileOutputStream("C:/2.txt");
            ArrayList list=new ArrayList();
            while (file1.available()>0){
            list.add(file1.read());
            }
            for (int i = list.size()-1; i >= 0; i--) {
                file2.write((int)list.get(i));
            }
            file1.close();
            file2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
