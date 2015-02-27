package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();

        map.put("Pushkin","Alexander");//1
        map.put("Lermontov","Mikhail");//2
        map.put("Tolstoy","Aleksey");//3
        map.put("Bukovsky","Charles");//4
        map.put("ttt","Nikolay");//5
        map.put("Presley", "Elvis");//6
        map.put("Jackson", "Michael");//7
        map.put("Jobs", "Steve");//8
        map.put("Gates", "Bill");//9
        map.put("Connor", "John");//10

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String FirstName = pair.getValue();
            if (FirstName.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int count=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String LastName = pair.getKey();
            if (LastName.equals(familiya)) count++;
        }
        return count;
    }
}