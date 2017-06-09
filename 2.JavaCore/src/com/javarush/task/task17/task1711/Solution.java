package com.javarush.task.task17.task1711;

import com.javarush.task.task17.task1710.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        DateFormat temp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        if (args[i + 1].equals("м")) allPeople.add(Person.createMale(args[i], temp.parse(args[i + 2])));
                        else allPeople.add(Person.createFemale(args[i], temp.parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                        i += 2;
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(temp.parse(args[i + 3]));
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i + 2].equals("м")) allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        else allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        i += 3;
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person pres = allPeople.get(Integer.parseInt(args[i]));
                        pres.setSex(null);
                        pres.setName(null);
                        pres.setBirthDay(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        String temp_sex = "";
                        DateFormat temp_print = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE))
                            temp_sex = "м";
                        else temp_sex = "ж";
                        System.out.println(allPeople.get(Integer.parseInt(args[i])).getName() + " " + temp_sex + " " + temp_print.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                    }
                }
                break;
            }
        }
    }
