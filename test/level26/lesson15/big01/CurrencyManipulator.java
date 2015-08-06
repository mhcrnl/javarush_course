package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulator
{
    String currencyCode;
    Map<Integer, Integer> denominations = new HashMap<>();

    public CurrencyManipulator(String currencyCode)
    {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        denominations.put(denomination, count);
        System.out.println("Деньги принято");
    }

    public int getTotalAmount() {
        int sum = 0;
        for (Map.Entry<Integer, Integer> pair: denominations.entrySet()) {
            int nominal = pair.getKey();
            int amount = pair.getValue();
            sum+=nominal*amount;
        }
        System.out.println("Общая сумма " + sum + currencyCode);
        return sum;
    }
}
