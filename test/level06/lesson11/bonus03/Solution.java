package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        int numbers[];
        numbers = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        numbers[0]=n1;
        int n2 = Integer.parseInt(reader.readLine());
        numbers[1]=n2;
        int n3 = Integer.parseInt(reader.readLine());
        numbers[2]=n3;
        int n4 = Integer.parseInt(reader.readLine());
        numbers[3]=n4;
        int n5 = Integer.parseInt(reader.readLine());
        numbers[4]=n5;
        Arrays.sort(numbers);
        for(int i = 0; i <  numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //Напишите тут ваш код
    }

}
