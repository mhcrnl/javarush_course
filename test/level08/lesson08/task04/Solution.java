package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Нестеренко", new Date("May 1 1980"));
        map.put("федько", new Date("May 1 1980"));
        map.put("хоменко", new Date("JUNE 1 1980"));
        map.put("боб", new Date("JUNE 1 1980"));
        map.put("титушка", new Date("JUNE 1 1980"));
        map.put("черница", new Date("May 1 1980"));
        map.put("маовский", new Date("JUNE 1 1980"));
        map.put("пофигкакой", new Date("JUNE 1 1980"));
        map.put("ололо", new Date("May 1 1980"));
        return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth()==5 || date.getMonth()==6 || date.getMonth()==7) {
                iterator.remove();
            }
        }

        //Напишите тут ваш код

    }
}
