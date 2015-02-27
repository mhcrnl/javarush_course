package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0
соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] int1 = new int[5];
        int[] int2 = new int[2];
        int[] int3 = new int[4];
        int[] int4 = new int[7];
        int[] int5 = new int[0];
        for (int i=0; i<int1.length; i++) {
            int1[i] = 1;
        }
        for (int i=0; i<int2.length; i++) {
            int2[i] = 2;
        }
        for (int i=0; i<int3.length; i++) {
            int3[i] = 3;
        }
        for (int i=0; i<int4.length; i++) {
            int4[i] = 4;
        }
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        list.add(int5);
        return list;
        //Написать тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
