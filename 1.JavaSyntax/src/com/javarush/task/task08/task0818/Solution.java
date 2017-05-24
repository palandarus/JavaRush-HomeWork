package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        map.put("Ivanov",400);
        map.put("Ivanov1",410);
        map.put("Ivanov2",500);
        map.put("Ivanov3",600);
        map.put("Ivanov4",700);
        map.put("Ivanov5",800);
        map.put("Ivanov6",300);
        map.put("Ivanov7",1000);
        map.put("Ivanov8",780);
        map.put("Ivanov9",6780);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int zp=iterator.next().getValue();
            if (zp < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {


    }
}