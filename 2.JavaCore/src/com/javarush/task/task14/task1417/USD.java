package com.javarush.task.task14.task1417;

/**
 * Created by pdv on 26.04.2017.
 */
public class USD extends Money{
    public String getCurrencyName(){
        return "USD";
    }
    public USD(double amount){
        super(amount);
    }
}
