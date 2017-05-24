package com.javarush.task.task14.task1408;

/**
 * Created by pdv on 25.04.2017.
 */
public class RussianHen extends Hen{
    public int getCountOfEggsPerMonth(){return 150;}
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
