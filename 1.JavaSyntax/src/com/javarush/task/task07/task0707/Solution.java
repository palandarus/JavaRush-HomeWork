package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stroki=new ArrayList<String>();
        String num="";
        for(int i=1;i<=5;i++) {
            num=num+i;
            stroki.add(num);
        }
        System.out.println(stroki.size());
        for(String s: stroki) System.out.println(s);

    }
}
