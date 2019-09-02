package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        try(BufferedReader file1=new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
            BufferedWriter file2=new BufferedWriter(new FileWriter(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        ){
String[] numbers=file1.readLine().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                Double temp=Double.valueOf(numbers[i]);
                if(temp>=0){
                    list.add((int)Math.round(temp));
                }
                else{
                    list.add((int)Math.round(temp));
                }

            }
            for(Integer i:list){
                file2.write(i+" ");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
