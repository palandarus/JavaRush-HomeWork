package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date today=new Date();
        System.out.printf("%td %tm %tY",today,today,today);
    }
}
