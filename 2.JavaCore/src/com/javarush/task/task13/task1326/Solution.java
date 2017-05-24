package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static java.util.Collections.sort;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        InputStream file = new FileInputStream(rd.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (file.available() > 0) {

            int temp=file.read();
            if((temp)%2==0)list.add((int)temp);
        }
        file.close();
        sort(list);
        Iterator<Integer> itera = list.iterator();
        /*while(itera.hasNext())
        {
            if(itera.next()%2!=0) itera.remove();
        }*/
        for(int i : list) System.out.println(i);
    }
}
