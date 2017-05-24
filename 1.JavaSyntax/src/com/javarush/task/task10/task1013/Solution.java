package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age,weight,height;
        private Human father,mother;

        public Human()
        {
            name="";
            age=5;
            weight=5;
            height=5;
        }
        public Human(String namee)
        {
            name=namee;
            age=5;
            weight=5;
            height=5;
        }

        public Human(String namee,int agee)
        {
            name=namee;
            age=agee;
            weight=5;
            height=5;
        }

        public Human(String namee,int agee, int weightt)
        {
            name=namee;
            age=agee;
            weight=weightt;
            height=5;
        }
        public Human(String namee,int agee, int weightt,int heightt)
        {
            name=namee;
            age=agee;
            weight=weightt;
            height=heightt;
        }

        public Human(String namee,int agee, int weightt,int heightt,Human fatherr)
        {
            name=namee;
            age=agee;
            weight=weightt;
            height=heightt;
            father=fatherr;
        }
        public Human(String namee,int agee, int weightt,int heightt,Human fatherr, Human motherr)
        {
            name=namee;
            age=agee;
            weight=weightt;
            height=heightt;
            father=fatherr;
            mother=motherr;
        }

        public Human(String namee, int heightt,Human fatherr, Human motherr)
        {
            name=namee;
            age=5;
            weight=5;
            height=heightt;
            father=fatherr;
            mother=motherr;

        }

        public Human(String namee,int agee,int heightt,Human fatherr, Human motherr)
        {
            name=namee;
            age=agee;
            weight=0;
            height=heightt;
            father=fatherr;
            mother=motherr;

        }

        public Human(String namee,Human fatherr)
        {
            name=namee;
            father=fatherr;
        }
    }
}
