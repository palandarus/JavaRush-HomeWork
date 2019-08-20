package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String filename1 = reader.readLine();
            String filename2 = reader.readLine();
            FileInputStream file1 = new FileInputStream(filename1);
            FileInputStream file2 = new FileInputStream(filename2);
            reader.close();
            BufferedReader readfile1 = new BufferedReader(new InputStreamReader(file1));
            BufferedReader readfile2 = new BufferedReader(new InputStreamReader(file2));
            String lines1;
            while ((lines1 = readfile1.readLine()) != null) {
                allLines.add(lines1);
            }
            String lines2;
            while ((lines2 = readfile2.readLine()) != null) {
                forRemoveLines.add(lines2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        for (int i = 0; i < allLines.size(); i++) {
            for (String s : forRemoveLines) {
                if (s.equals(allLines.get(i)))
                    allLines.remove(s);
            }
        }
    }
}

