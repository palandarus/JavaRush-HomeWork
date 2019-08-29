package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader readfile=new BufferedReader(new FileReader(args[0]))){
            ArrayList<String> list=new ArrayList<>();
            list.addAll(readfile.lines().collect(Collectors.toList()));
            int count=0;
            for (String x:list) {
                Pattern pattern = Pattern.compile("[a-zA-Z]");
                Matcher matcher = pattern.matcher(x);
                while (matcher.find()){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
