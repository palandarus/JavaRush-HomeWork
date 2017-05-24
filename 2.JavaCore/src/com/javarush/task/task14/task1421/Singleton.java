package com.javarush.task.task14.task1421;

/**
 * Created by pdv on 26.04.2017.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }
}
