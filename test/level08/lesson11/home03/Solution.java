package com.javarush.test.level08.lesson11.home03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Аннова", "Аня");
        map.put("Иванов", "Ваня");
        map.put("Танина", "Таня");
        map.put("Петров", "Петя");
        map.put("Васильев", "Вася");
        map.put("Григорьев", "Петя");
        map.put("Фросин", "Фрося");
        map.put("Фросин", "Кукуся");
        map.put("Зайцев", "Зая");
        map.put("Ололоев", "Ололо");//Напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " " + value);
        }
    }

}
