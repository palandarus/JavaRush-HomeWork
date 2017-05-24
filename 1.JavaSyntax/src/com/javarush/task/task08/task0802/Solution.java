package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> list=new HashMap<>();
        list.put("арбуз","ягода");
        list.put("банан","трава");
        list.put("вишня","ягода");
        list.put("груша","фрукт");
        list.put("дыня","овощ");
        list.put("ежевика","куст");
        list.put("жень-шень","корень");
        list.put("земляника","ягода");
        list.put("ирис","цветок");
        list.put("картофель","клубень");


        Iterator<Map.Entry<String,String>> it=list.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String,String> pair=it.next();
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }

    }
}
