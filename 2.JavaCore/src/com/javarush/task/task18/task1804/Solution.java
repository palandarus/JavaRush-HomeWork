package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 1, max = 1;
        HashMap<String, Integer> result = new HashMap<>();
        ArrayList incoming = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file=new FileInputStream(reader.readLine());
        //FileInputStream file = new FileInputStream("C:/1.txt");
        while (file.available() > 0) {
            incoming.add(file.read());
        }
        file.close();
        for (int i = 0; i < incoming.size(); i++) {
            if (max > count) max = count;
            count = 1;
            for (int j = 0; j < incoming.size(); j++) {

                if (incoming.get(i).equals(incoming.get(j))) {
                    result.put(incoming.get(i).toString(), count++);
                }
            }
        }
        for (Map.Entry cell : result.entrySet()) {
            if (cell.getValue().equals(max)) {
                System.out.print(cell.getKey() + " ");
            }
        }
    }
}
