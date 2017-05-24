package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> result=new HashMap<String, String>();
        result.put("Ivanov", "Ivan1");
        result.put("Ivanov1", "Ivan2");
        result.put("Ivanov2", "Ivan3");
        result.put("Ivanov3", "Ivan3");
        result.put("Ivanov4", "Ivan4");
        result.put("Ivanov4", "Ivan5");
        result.put("Ivanov6", "Ivan6");
        result.put("Ivanov7", "Ivan7");
        result.put("Ivanov8", "Ivan1");
        result.put("Ivanov", "Ivan8");

        return result;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
