package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String[] temp={"user", "loser", "coder", "proger"};
        boolean flag=true;

        while (flag)
        {
            String te=reader.readLine();
            if(te.equals("user")) {
                person=new Person.User();
                doWork(person);
            }
            else if(te.equals("loser")) {
                person=new Person.Loser();
                doWork(person);
            }
            else if(te.equals("coder")) {
                person=new Person.Coder();
                doWork(person);
            }
            else if(te.equals("proger")) {
                person=new Person.Proger();
                doWork(person);
            }
            else flag=false;

        }




    }

    public static void doWork(Person person) {
        if(person instanceof Person.Coder) ((Person.Coder) person).coding();
        else if(person instanceof Person.User) ((Person.User) person).live();
        else if(person instanceof Person.Loser) ((Person.Loser)person).doNothing();
        else ((Person.Proger)person).enjoy();
    }
}
