package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader file = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()))) {
            ArrayList<String> goods = new ArrayList<>();
            goods.addAll(file.lines().collect(Collectors.toList()));
            for (String x:goods) {
                if(x.split(" ")[0].equals(args[0])) System.out.println(x);
            }
        }
    }
}
