package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 07.04.15.
 */
public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth(){return 4;}
    String getDescription(){
        return super.getDescription()+" Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
