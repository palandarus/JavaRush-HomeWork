package com.javarush.task.task14.task1408;

/**
 * Created by pdv on 25.04.2017.
 */
public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){return 16;}
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
