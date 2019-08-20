package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            FileOutputStream file3 = new FileOutputStream(reader.readLine());
//            FileInputStream file1 = new FileInputStream("C:/1.txt");
//            FileOutputStream file2 = new FileOutputStream("C:/2.txt");
//            FileOutputStream file3 = new FileOutputStream("C:/3.txt");
            ArrayList list = new ArrayList();
            while (file1.available() > 0) {
                list.add(file1.read());
            }
            for (int i = 0; i < list.size(); i++) {
                if (i <= ((list.size() - list.size() / 2)-1)) file2.write((int) list.get(i));
                else file3.write((int) list.get(i));
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
