package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
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
        int maxCount=0;
        int maxByte=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]>maxCount) {
                maxCount = array[i];
                maxByte = i;
            }
        }
        System.out.println(maxByte);
    }
}
