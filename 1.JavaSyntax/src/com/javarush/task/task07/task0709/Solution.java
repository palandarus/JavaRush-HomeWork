package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        int min = 0;

        BufferedReader r = new BufferedReader( new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            list.add(r.readLine());
            String k = list.get(i);
            if( k.length() > min){
                min = k.length();
            }
        }
        for( int i = 0; i < list.size(); i++){
            String k = list.get(i);
            if( k.length() < min){
                min = k.length();
            }
        }
        for( int i = 0; i < list.size(); i++){
            String n = list.get(i);
            if( n.length() == min){
                System.out.println(list.get(i));
            }
        }
    }
}
