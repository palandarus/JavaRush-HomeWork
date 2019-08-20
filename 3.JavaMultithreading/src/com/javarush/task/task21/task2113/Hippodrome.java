package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public void run() throws Exception{
        for (int i = 1; i < 101; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }



    public void move() {
        for (int i = 0; i < getHorses().size(); i++) {
            (getHorses()).get(i).move();
        }
    }



    public void print() {
        for (int i = 0; i < getHorses().size(); i++) {
            (getHorses()).get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }



    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws Exception{
        Horse Bella = new Horse("Bella", 3, 0);
        Horse Cella = new Horse("Cella", 3, 0);
        Horse Della = new Horse("Della", 3, 0);
        List<Horse> newhorse = new ArrayList<>();
        newhorse.add(Bella);
        newhorse.add(Cella);
        newhorse.add(Della);
        game = new Hippodrome(newhorse);
        game.run();

    }

}
