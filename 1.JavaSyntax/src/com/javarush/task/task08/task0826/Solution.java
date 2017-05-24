package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        ArrayList<Integer> lll=new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            lll.add(array[i]);
        }
        lll.sort(Comparator.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            array[i]=lll.get(i);
        }
    }
}
