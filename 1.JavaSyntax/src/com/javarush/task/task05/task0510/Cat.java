package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String address;
    String color;
    String name;
    int age;
    int weight;
    public void initialize(String name){
        this.name = name;
        this.age = 7;
        this.weight = 5;
        this.color = "black";
    }
    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "black";
    }
    public void initialize(int weight, String color)
    {
        this.color = color;
        this.weight = weight;
        this.age = 7;
    }
    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 7;
    }

    public static void main(String[] args) {

    }
}
