package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat cat1 = new Cat("vaska0");
        Cat cat2 = new Cat("vaska1");
        Cat cat3 = new Cat("vaska2");
        Cat cat4 = new Cat("vaska3");
        Cat cat5 = new Cat("vaska4");
        Cat cat6 = new Cat("vaska5");
        Cat cat7 = new Cat("vaska6");
        Cat cat8 = new Cat("vaska7");
        Cat cat9 = new Cat("vaska8");
        Cat cat10 = new Cat("vaska9");
        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat10.name, cat10);
        return map;
        //Напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
        //Напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
