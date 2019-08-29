package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception{
        try (BufferedReader readfile = new BufferedReader(new FileReader(args[0]))) {
            ArrayList<String> list = new ArrayList<>();
            list.addAll(readfile.lines().collect(Collectors.toList()));
            double count = 0,allcount=0;
            for (String x : list) {
                allcount+=x.length();
                Pattern pattern = Pattern.compile("\\s");
                Matcher matcher = pattern.matcher(x);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.printf("%.2f %n",count/allcount*100);
        }
    }
}
