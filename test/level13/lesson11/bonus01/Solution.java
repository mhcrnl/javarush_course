package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        List<Integer> list = new ArrayList<Integer>();
        while (in.ready()) {
            int data = Integer.parseInt(in.readLine());
            list.add(data);
        }
        Collections.sort(list);
        for (Integer j: list) {
            if ((j%2)==0) System.out.println(j);
        }


        // напишите тут ваш код
    }
}
