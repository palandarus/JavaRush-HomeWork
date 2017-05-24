package com.javarush.task.task14.task1408;

/**
 * Created by pdv on 25.04.2017.
 */
public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){return 100;}
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
