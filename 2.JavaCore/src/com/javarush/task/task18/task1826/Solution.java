package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileWriter fileout = new FileWriter(args[2]);
        fileout.write("");
        fileout.close();
        try (FileReader fileinput = new FileReader(args[1]);
             FileWriter fileoutput = new FileWriter(args[2], true)) {
            int temp;
            ArrayList<Integer> enc_list = new ArrayList<>();
            while ((temp = fileinput.read()) != -1) {
                if (args[0].equals("-e")) {
                    if (temp != 255) enc_list.add(temp + 1);
                    else enc_list.add(0);
                } else if (args[0].equals("-d")) {
                    if (temp != 0) enc_list.add(temp - 1);
                    else enc_list.add(255);
                }
            }
            for (Integer i : enc_list) {
                fileoutput.write(i);
            }
        }
    }
}

