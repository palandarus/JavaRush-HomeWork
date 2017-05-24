package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Date inputdate=new Date(sc.nextLine());
        SimpleDateFormat dateFormat=new SimpleDateFormat("MMM dd, YYYY",Locale.ENGLISH);
        System.out.println(dateFormat.format(inputdate).toUpperCase());
    }
}
