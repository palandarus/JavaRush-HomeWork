package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map=new HashMap<String, String>();
        map.put("Ivanov","Ivan");
        map.put("Ivanov1","Ivan1");
        map.put("Ivanov2","Ivan2");
        map.put("Ivanov3","Ivan3");
        map.put("Ivanov4","Ivan4");
        map.put("Ivanov5","Ivan5");
        map.put("Ivanov6","Ivan6");
        map.put("Ivanov7","Ivan7");
        map.put("Ivanov8","Ivan8");
        map.put("Ivanov9","Ivan9");
        return map;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

            HashMap unique=new HashMap();
            HashMap<String,String> copyMap=new HashMap<String, String>(map);
            for (Map.Entry<String, String> pairy : copyMap.entrySet())
            {
                if(unique.containsValue(pairy.getValue())) removeItemFromMapByValue(map,pairy.getValue());
                else unique.put(pairy.getKey(),pairy.getValue());
            }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
