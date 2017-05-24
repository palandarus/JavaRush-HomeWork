package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map=new HashMap<String,String>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i),String.valueOf(i));
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int Count=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().getValue().equals(name)) Count+=1;
        }
        return Count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int Count=0;
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()) {
            if (iterator.next().getKey().equals(lastName)) Count+=1;
        }
        return Count;
    }

    public static void main(String[] args) {

    }
}
