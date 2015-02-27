package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String[] month = new String[12];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthNumber = reader.readLine();
        for (int i=0; i<month.length; i++) {
            if (monthNumber.equals(month[i])) {
                System.out.print(month[i]+" is " + (i+1) + " month");
                break;
            }
        }



        //add your code here - напиши код тут
    }

}
