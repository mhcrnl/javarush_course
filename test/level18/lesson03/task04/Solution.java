package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int[] array = new int[128];
        while (inputStream.available()>0) {
            int readByte = inputStream.read();
            array[readByte] += 1;
        }
        int minCount=Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if (array[i]!=0) {
                if (array[i]<minCount)
                minCount = array[i];
            }
        }
        for (int i=0; i<array.length; i++) {
            if (array[i]==minCount) System.out.print(i+" ");
        }
    }
}
