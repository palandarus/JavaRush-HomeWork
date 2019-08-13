package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        //FileInputStream file = new FileInputStream("c:/1.txt");
        int max = 0;
        int i = 0;
        while (file.available() > 0) {
            if (i == 0) max = file.read();
            else {
                int temp = file.read();
                if (max < temp) max = temp;
            }
            i++;
        }
        file.close();
        System.out.println(max);
    }
}
