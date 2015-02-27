package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        Date date2 = new Date(date);
        String s = "MMM dd, YYYY";
        SimpleDateFormat dateFormat = new SimpleDateFormat(s, Locale.ENGLISH);
        System.out.print(dateFormat.format(date2).toUpperCase());
        //Напишите тут ваш код
    }
}
