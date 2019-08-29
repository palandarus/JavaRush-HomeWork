package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader infile2 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        BufferedReader infile1 = new BufferedReader(new FileReader(filename1));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(infile2.lines().collect(Collectors.toList()));
        list.addAll(infile1.lines().collect(Collectors.toList()));
        infile1.close();
        FileWriter file1 = new FileWriter(filename1);
        for (String x : list) {
            file1.write(x);

        }
        infile2.close();
        file1.close();
    }
}
