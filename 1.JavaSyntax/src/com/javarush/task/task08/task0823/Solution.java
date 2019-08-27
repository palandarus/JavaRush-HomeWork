package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] list=string.split("\\s");
        string="";
        for (int i = 0; i < list.length; i++) {
            if(list[i]!=""&&!list[i].isEmpty()&&list[i]!=null) {
                string += list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
                if (i != list.length - 1) string += " ";
            }
        }
        System.out.println(string);
    }

}
