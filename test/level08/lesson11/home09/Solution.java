package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года -
нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        boolean oddOrEven = isDateOdd(s);
        System.out.print(s+ " = " + oddOrEven);
    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date("JANUARY 1 2015");
        Date date2 = new Date(date);
        long ms1 = date1.getTime();
        long ms2 = date2.getTime();
        long ms = (ms2 - ms1)/(1000*60*60*24);
        if (ms%2==0) return true;
        else return false;
    }
}
