package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list3=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> listsame=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list.add(sc.nextInt());
            if(list.get(i)%3==0) list3.add(list.get(i));
            if(list.get(i)%2==0) list2.add(list.get(i));
            if(list.get(i)%2!=0&&list.get(i)%3!=0) listsame.add(list.get(i));
        }
        printList(list3);
        printList(list2);
        printList(listsame);
    }

    public static void printList(List<Integer> list) {
        for(int i:list) System.out.println(i);
    }
}
