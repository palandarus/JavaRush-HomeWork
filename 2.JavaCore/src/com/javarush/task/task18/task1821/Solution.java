package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        int symbol;
        Map<Integer, Integer> map = new TreeMap<>();
        try (BufferedReader file = new BufferedReader(new FileReader(args[0]))) {
            while ((symbol = file.read()) != -1) {
                if (map.containsKey(symbol)) map.put(symbol, map.get(symbol) + 1);
                else map.put(symbol, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a= entry.getKey();

            System.out.println((char)a+" " + entry.getValue());
        }
    }
}
