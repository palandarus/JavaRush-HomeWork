package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        /*System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));*/
    }

    public static boolean isDateOdd(String date) {

        Date temp=new Date(date);
        String[] t=date.split(" ");
        String start="JANUARY 1 "+t[2];
        Date startyear=new Date(start);
        long interval=temp.getTime()-startyear.getTime();
        long s=1000*3600*24;
        int res=1+(int)(interval/s);
        if((res%2)==1) return true;
        else return false;
    }
}
