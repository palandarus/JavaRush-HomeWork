package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> sett=new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            sett.add(i);
        }
    return sett;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> result=(HashSet)set.clone();// в чем тут прикол? зачем создавать второе множество и работать с ним, почему нельзя ковырять переданное
        for(Integer i:set)
        {
            if(i>10) result.remove(i);
        }
        return  result;
    }

    public static void main(String[] args) {

    }
}
