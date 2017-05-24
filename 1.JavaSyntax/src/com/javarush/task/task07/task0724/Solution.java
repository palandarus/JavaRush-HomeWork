package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human GrandDad1=new Human("Ivan", true,56);
        Human GrandDad2=new Human("Oleg",true,54);
        Human GrandMom1=new Human("Olga",false,56);
        Human GrandMom2=new Human("Masha",false,50);
        Human Mom=new Human("Mira",false,27,GrandDad1,GrandMom1);
        Human Dad=new Human("Zahar", true,30, GrandDad2, GrandMom2);
        Human kid1=new Human("Ilya", true, 10, Dad, Mom);
        Human kid2=new Human("Mira",false,4,Dad,Mom);
        Human kid3=new Human("Kira",false,4,Dad,Mom);
        System.out.println(GrandDad1.toString());
        System.out.println(GrandDad2.toString());
        System.out.println(GrandMom1.toString());
        System.out.println(GrandMom2.toString());
        System.out.println(Dad.toString());
        System.out.println(Mom.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















