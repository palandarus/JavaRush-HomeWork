package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        try (
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()))))
//                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("C://1.txt"))))
                {
            int[] array=fileReader.lines().mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==0) list.add(array[i]);
            }
            Collections.sort(list);
            for(Integer x: list){
                System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
