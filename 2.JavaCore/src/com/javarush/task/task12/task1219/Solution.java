package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Run, Swim{
        public void run(){
            System.out.println("Running");
        }

        public void swim(){
            System.out.println("Swimming");
        }

    }

    public class Duck implements Run,Swim,Fly{
        public void run(){
            System.out.println("Running");
        }

        public void swim(){
            System.out.println("Swimming");
        }
        public void fly(){
            System.out.println("Flying");
        }
    }

    public class Penguin implements Run, Swim{
        public void run(){
            System.out.println("Running");
        }

        public void swim(){
            System.out.println("Swimming");
        }

    }

    public class Airplane implements Fly, Run{
        public void run(){
            System.out.println("Running");
        }

        public void fly(){
            System.out.println("Flying");
        }

    }
}
