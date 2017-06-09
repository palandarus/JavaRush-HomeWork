package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        DateFormat temp=new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if(args[0].equals("-c")){
            if(args[2].equals("м")) allPeople.add(Person.createMale(args[1], temp.parse(args[3])));
            else allPeople.add(Person.createFemale(args[1], temp.parse(args[3])));
            System.out.println(allPeople.size()-1);
        }
        else if(args[0].equals("-u")){
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(temp.parse(args[4]));
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            if(args[3].equals("м")) allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            else allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
        }
        else if(args[0].equals("-d")){
            Person pres=allPeople.get(Integer.parseInt(args[1]));
            pres.setSex(null);
            pres.setName(null);
            pres.setBirthDay(null);
        }
        else if(args[0].equals("-i")){
            String temp_sex="";
            DateFormat temp_print=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            if(allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) temp_sex="м";
            else temp_sex="ж";
            System.out.println(allPeople.get(Integer.parseInt(args[1])).getName()+" "+temp_sex+" "+temp_print.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
        }
    }
}
