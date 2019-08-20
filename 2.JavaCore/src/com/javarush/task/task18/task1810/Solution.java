package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1000;
        while (count >= 1000) {
            try {
                FileInputStream file = new FileInputStream(reader.readLine());
//                FileInputStream file = new FileInputStream("C:/1.txt");
                count=0;
                while (file.available()>0){
                    file.read();
                    count++;
                }
                file.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        throw  new DownloadException();
        //System.out.println(count);
    }

    public static class DownloadException extends Exception {

    }
}
