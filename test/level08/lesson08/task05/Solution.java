package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();//Напишите тут ваш код
        map.put("Аннова", "Аня");
        map.put("Иванов", "Ваня");
        map.put("Танина", "Таня");
        map.put("Петров", "Петя");
        map.put("Васильев", "Вася");
        map.put("Григорьев", "Петя");
        map.put("Фросина", "Фрося");
        map.put("Фросин", "Кукуся");
        map.put("Зайцев", "Зая");
        map.put("Ололоев", "Ололо");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            for (Map.Entry<String, String> pair2 : map2.entrySet())
            {
                if (!pair2.getKey().equals(pair.getKey()) && pair.getValue().equals(pair2.getValue()))
                    removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
