package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon1", new Date("JUNE 1 1980"));
        map.put("Stallon2", new Date("APRIL 1 1980"));
        map.put("Stallon3", new Date("JUNE 1 1980"));
        map.put("Stallon4", new Date("JULY 1 1980"));
        map.put("Stallon5", new Date("JUNE 1 1980"));
        map.put("Stallon6", new Date("MAY 1 1980"));
        map.put("Stallon7", new Date("JUNE 1 1980"));
        map.put("Stallon8", new Date("DECEMBER 1 1980"));
        map.put("Stallon9", new Date("JUNE 1 1980"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {


        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            int a = itr.next().getValue().getMonth();
            if (a>=5 && a<=7) itr.remove();
        }
    }

    public static void main(String[] args) {

    }
}
