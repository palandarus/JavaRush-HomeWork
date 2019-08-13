package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        //FileInputStream file = new FileInputStream("c:/1.txt");
        int min = 0;
        int i = 0;
        while (file.available() > 0) {
            if (i == 0) min = file.read();
            else {
                int temp = file.read();
                if (min > temp) min = temp;
            }
            i++;
        }
        file.close();
        System.out.println(min);
    }

}
