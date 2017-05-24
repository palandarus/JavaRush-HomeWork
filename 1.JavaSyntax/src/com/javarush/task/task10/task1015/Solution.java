package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list=new ArrayList[10];
        for (int i = 0; i < 10 ; i++) {
            list[i]=new ArrayList<String>();
            for (int j = 0; j < (Math.random()*10); j++)
            {

            list[i].add("abracadabra"+i+j);
            }

        }

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}