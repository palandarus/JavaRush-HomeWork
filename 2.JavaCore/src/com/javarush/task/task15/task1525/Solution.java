package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static{
        String temp="";

            try {
                BufferedReader rd=new BufferedReader(new FileReader(Statics.FILE_NAME));
                while((temp=rd.readLine())!=null)
                {
                    lines.add(temp);
                    //System.out.println(temp);
                }
            }
            catch  (Exception e)
            {
                System.out.println(e);
            }

    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
