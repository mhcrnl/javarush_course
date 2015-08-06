package com.javarush.test.level26.lesson15.big01;


import java.io.IOException;
import java.util.Locale;

public class CashMachine
{
    public static void main (String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);

        String currencyCode = ConsoleHelper.askCurrencyCode();
        String[] twoDigit = ConsoleHelper.getValidTwoDigits(currencyCode);
        CurrencyManipulator manipulator = new CurrencyManipulator(currencyCode);
        manipulator.addAmount(Integer.parseInt(twoDigit[0]), Integer.parseInt(twoDigit[1]));

        manipulator.getTotalAmount();
        System.out.println(ConsoleHelper.askOperation());
    }
}
