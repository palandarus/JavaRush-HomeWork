package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=0;
        int minimum=0;
        int massiv[]=new int[20];
        for (int i = 0; i < 20; i++) {
            massiv[i]=Integer.parseInt(reader.readLine());
            if(i==0)
            {
                minimum=massiv[i];
                maximum=massiv[i];
            }
            else
            {
                if(minimum>massiv[i]) minimum=massiv[i];
                if(maximum<massiv[i]) maximum=massiv[i];
            }
        }
        //напишите тут ваш код

        System.out.print(maximum+" ");
        System.out.println(minimum);
    }
}
