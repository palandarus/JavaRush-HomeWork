package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Eat, Move{
        public void move(){
            System.out.println("Moving");
        }
        public void eat(){
            System.out.println("Eating");
        }
    }

    public class Duck implements Eat, Fly, Move{
        public void fly(){
            System.out.println("Flying");
        }
        public void eat(){
            System.out.println("Eating");
        }
        public void move(){
            System.out.println("Moving");
        }
    }

    public class Car implements Move{
        public void move(){
            System.out.println("Moving");
        }
    }

    public class Airplane implements Fly,Move{
        public void fly(){
            System.out.println("Flying");
        }
        public void move(){
            System.out.println("Moving");
        }
    }
}
