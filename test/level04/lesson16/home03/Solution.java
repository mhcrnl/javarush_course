package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int Sum;
        for(int i = 0; i!=-1; i = Sum)
        {
            String num = read.readLine();
            int a = Integer.parseInt(num);
            Sum = a+i;
            if(a!=-1)
            {
                continue;
            }
            else
            {
                System.out.println(Sum);
                break;
            }
        }



    }
}
