package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        try {
            //FileInputStream file = new FileInputStream("C:/1.txt");
            FileInputStream file = new FileInputStream(reader.readLine());
            while (file.available()>0){
            if(((char)file.read())==',') count++;
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
