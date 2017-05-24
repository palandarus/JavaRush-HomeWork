package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human kid1=new Human("Iliya",true,10);
        Human kid2=new Human("Matvey",true,5);
        Human kid3=new Human("Milana",false,2);
        ArrayList<Human> kids=new ArrayList<Human>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        Human otez=new Human("Ivan",true,28,kids);
        Human mat=new Human("Ivani",false,28,kids);
        Human ded1=new Human("Ivan1",true,56);
        Human ded2=new Human("Ivan2",true,56);
        Human bab1=new Human("Mary",false,50);
        Human bab2=new Human("Ilina",false,50);
        ded1.children.add(otez);
        ded2.children.add(mat);
        bab1.children.add(otez);
        bab2.children.add(mat);
        System.out.println(otez);
        System.out.println(mat);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        String name; boolean sex; int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
