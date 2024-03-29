package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть поток

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        String line;
        String[] strings;
        while ((line=readFile.readLine()) != null) {
            strings = line.split(" ");
            for (int i=strings.length-1; i>=0; i--) {

                StringBuilder sb = new StringBuilder(strings[i]);
                sb=sb.reverse();
                System.out.print(sb.toString()+" ");
            }
            System.out.print("\n");
        }
    }
}
