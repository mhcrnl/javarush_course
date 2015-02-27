package com.javarush.test.level05.lesson12.bonus03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum=0;
        int N = Integer.parseInt(reader.readLine());
        if (N>0) {
            int[] a = new int[N];
            if (N==1) {
                a[0]=Integer.parseInt(reader.readLine());
                maximum = a[0];
            }
            else {
                for (int i=0; i<N; i++) {
                    a[i]=Integer.parseInt(reader.readLine());
                }
                maximum = a[0];
                for (int i=1; i<N; i++) {
                    if (a[i]>maximum) {
                        maximum=a[i];
                    }
                }
            }
        }
        else {
            System.out.println("Число должно быть больше 0");
        }
        //напишите здесь ваш код
        System.out.println(maximum);
    }
}
