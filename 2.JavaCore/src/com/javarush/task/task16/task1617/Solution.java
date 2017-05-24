package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        clock.start();
        Thread.sleep(3500);
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int time=0;
            boolean flag=true;
            while(countSeconds>0)
            {
                try{
                    if(time<3.5)
                    {
                        if(countSeconds>0)
                        {
                            System.out.print(countSeconds);
                            Thread.sleep(500);
                            time+=0.5;
                            Thread.sleep(500);
                            time+=0.5;
                            System.out.print(countSeconds+" ");
                            countSeconds--;
                        }
                        else
                        {
                            System.out.println("Марш");
                            flag=false;
                        }
                    }
                    else
                    {

                        flag=false;
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Прервано");
                    e.printStackTrace();
                    flag=false;
                }
            }
        }
    }
}
