package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws Exception{
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        String temp=rd.readLine();
        if(temp.equals(Planet.SUN)) thePlanet=Sun.getInstance();
        else if(temp.equals(Planet.MOON)) thePlanet=Moon.getInstance();
        else if(temp.equals(Planet.EARTH)) thePlanet=Earth.getInstance();
        else thePlanet=null;
    }
}
