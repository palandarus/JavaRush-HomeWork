package com.javarush.task.task14.task1417;

/**
 * Created by pdv on 26.04.2017.
 */
public class Hrivna extends Money{
    public String getCurrencyName(){
        return "HRN";
    }
    public Hrivna(double amount){
        super(amount);
    }
}
