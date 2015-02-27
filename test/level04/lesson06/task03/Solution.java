package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        int max;
        int min;
        int mid;
        if (a>b) {
            if (a>c) {
                if (b>c) {
                    max = a;
                    mid = b;
                    min = c;
                }
                else {
                    max = a;
                    mid = c;
                    min = b;
                }
            }
            else {
                max = c;
                mid = a;
                min = b;
            }

        }
        else {
            if(b>c) {
                if(a>c) {
                    max = b;
                    mid = a;
                    min = c;
                }
                else {
                    max = b;
                    mid = c;
                    min = a;
                }
            }
            else {
                max = c;
                mid = b;
                min = a;
            }
        }
        System.out.println(max + " " + mid + " " + min);
        //Напишите тут ваш код
       }
}
