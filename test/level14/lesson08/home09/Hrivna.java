package com.javarush.test.level14.lesson08.home09;

/**
 * Created by User on 08.04.15.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){return "HRN";};
}
