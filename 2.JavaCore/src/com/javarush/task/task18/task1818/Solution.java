package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (
                FileWriter file1 = new FileWriter(new BufferedReader(new InputStreamReader(System.in)).readLine(),true);
                BufferedReader file2 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                BufferedReader file3 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        ) {
            ArrayList<String> list2=new ArrayList<>();
            ArrayList<String> list3=new ArrayList<>();
            list2.addAll(file2.lines().collect(Collectors.toList()));
            list3.addAll(file3.lines().collect(Collectors.toList()));
            for (String x:list2) {
                file1.write(x);
            }
            for (String x:list3) {
                file1.write(x);
            }

        }
    }
}
