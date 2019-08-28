package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader fileInput1 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
             BufferedReader fileInput2 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()))
        ) {

            allLines.addAll(fileInput1.lines().collect(Collectors.toList()));
            forRemoveLines.addAll(fileInput2.lines().collect(Collectors.toList()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Solution c = new Solution();
            c.joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
