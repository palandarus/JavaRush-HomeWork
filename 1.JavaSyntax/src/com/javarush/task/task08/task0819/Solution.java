package com.javarush.task.task08.task0819;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator iterator=cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> shobla=new HashSet<>();
        shobla.add(new Cat());
        shobla.add(new Cat());
        shobla.add(new Cat());
        return shobla;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    public static class Cat{

    }// step 1 - пункт 1
}
