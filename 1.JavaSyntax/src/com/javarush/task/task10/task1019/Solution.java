package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id = "";
        String name = "";
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            try {
                id = reader.readLine();
                if (id.isEmpty()) break;
                name = reader.readLine();
                map.put(name, Integer.parseInt(id));
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }

        for (Map.Entry<String, Integer> x : map.entrySet()) {
            System.out.println(x.getValue() + " " + x.getKey());
        }

    }
}
