package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();

    }

    public static Flyable result;

    public static void reset() {

        try
        {
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
            String temp=rd.readLine();
            if(temp.equals("plane")) {
                result=new Plane(Integer.parseInt(rd.readLine()));
            }
            else if(temp.equals("helicopter")) result=new Helicopter();
            rd.close();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
