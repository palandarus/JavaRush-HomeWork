package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list=new ArrayList<int[]>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
        for (int i = 0; i < 5; i++) {
            int[] temp=new int[list.get(i).length];
            for(int j=0;j<list.get(i).length;j++)
            {
               temp[j]= (int)(Math.random()*10);
                //System.out.println(temp[j]);
            }
            list.set(i,temp);

        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
