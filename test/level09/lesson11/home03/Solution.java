package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все
введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                int n = Integer.parseInt(reader.readLine());
                list.add(n);
            }

        }
        catch (Exception e) {
            for (int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

        //add your code here
    }
}
