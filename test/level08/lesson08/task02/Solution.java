package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> intNum = new HashSet<Integer>();
        intNum.add(1);
        intNum.add(2);
        intNum.add(3);
        intNum.add(4);
        intNum.add(5);
        intNum.add(6);
        intNum.add(7);
        intNum.add(8);
        intNum.add(9);
        intNum.add(10);
        intNum.add(11);
        intNum.add(12);
        intNum.add(13);
        intNum.add(14);
        intNum.add(15);
        intNum.add(16);
        intNum.add(17);
        intNum.add(18);
        intNum.add(19);
        intNum.add(20);
        return intNum;
        //Напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i>10) {
                itr.remove();
            }
        }
        return set;//Напишите тут ваш код

    }
}
