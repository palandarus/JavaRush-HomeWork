package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min=array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if(min>array.get(i)) min=array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
        {
            result.add(sc.nextInt());
        }
        return result;
    }
}
