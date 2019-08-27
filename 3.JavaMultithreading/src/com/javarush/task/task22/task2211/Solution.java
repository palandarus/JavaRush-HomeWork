package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        String fileNameIn = args[0];
        String fileNameOut = args[1];
        try(
        BufferedReader reader =new BufferedReader (new InputStreamReader(new FileInputStream(fileNameIn), "windows-1251"));
        BufferedWriter writer=new BufferedWriter (new OutputStreamWriter(new FileOutputStream(fileNameOut),"UTF-8"));
        ){
            while (true){
                String line=reader.readLine();
                if(line==null||line.isEmpty()||line=="") break;
                writer.write(line);
            }
        }catch (Exception e){e.printStackTrace();}


    }
}
