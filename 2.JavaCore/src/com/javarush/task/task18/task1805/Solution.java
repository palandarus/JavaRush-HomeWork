package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        //FileInputStream file = new FileInputStream("C:/1.txt");
        HashSet list=new HashSet();
        while (file.available() > 0) {
            try {
                list.add((byte) file.read());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        file.close();
        List result = new ArrayList(list);
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).toString()+" ");

        }
    }


}
