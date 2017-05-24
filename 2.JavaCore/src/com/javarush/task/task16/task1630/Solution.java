package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        catch(Exception e)
        {
            e.printStackTrace();;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String filename="";
        private String content="",temp="";
        public void setFileName(String fullFileName){filename=fullFileName;}
        public synchronized String getFileContent(){


            return content.trim();
        }


        public void run() {
            try{
                BufferedReader fl = new BufferedReader(new FileReader(filename));
                while((temp=fl.readLine())!=null) {
                      content += temp + " ";
                  }

                }

            catch (Exception e)
            {
                System.out.println(Thread.currentThread()+" :Interrupted");
            }

        }

    }
}
