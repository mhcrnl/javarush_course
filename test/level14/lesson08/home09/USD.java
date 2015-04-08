package com.javarush.test.level14.lesson08.home09;

/**
 * Created by User on 08.04.15.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){return "USD";};
}
