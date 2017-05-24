package com.javarush.task.task08.task0823;

//import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result="";
        result=String.valueOf(s.charAt(0)).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==32)
            {
                result=result+" "+String.valueOf(s.charAt(i+1)).toUpperCase();
                i++;
            }
            else result+=String.valueOf(s.charAt(i));
        }
        s=result;
        System.out.println(s);



    }
}
