package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int max = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<5;i++) {
            list.add(scanner.nextLine());
            if (list.get(i).length()>max)
                max = list.get(i).length();
        }
        for (int i=0;i<5;i++) {
            if (list.get(i).length()==max)
                System.out.println(list.get(i));
        }
    }
}
