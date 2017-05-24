package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        for (int i = 1; i < 6; i++) {
            threads.add(new MyThread(i));
        }
    }
    public static void main(String[] args) {
    }
    public static class MyThread extends Thread implements Message {
        public int flag = 0;
        public void run() {
            if (flag == 1) {
                for (int i = 0; i < 5; i++) {
                    i--;
                }
            } else if (flag == 2) {
                if (isInterrupted()) System.out.println("InterruptedException");
            } else if (flag == 3) {
                while (!isInterrupted()) {
                    try {

                        System.out.println("Ура");
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else if (flag == 4) {
            } else if (flag == 5) {
                int sum = 0;
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (!isInterrupted()) {
                    try {
                        String temp = "";
                        while (!("N").equals(temp = reader.readLine())) {
                            sum += Integer.parseInt(temp);
                        }
                        System.out.println(sum);
                        sum = 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        public MyThread(int a) {
            flag = a;
        }
        @Override
        public void showWarning() {
            //this.interrupt();
            while (isAlive()) { }
        }
    }
}