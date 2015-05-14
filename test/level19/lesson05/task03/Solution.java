package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        String destinationFile = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile, true));
        String s="";
        while (reader1.ready()) {
            s=reader1.readLine();
            String[] temp = s.split(" ");
            for (String ss: temp) {
                try {
                    int i = Integer.parseInt(ss);
                    writer.write(i+" ");
                } catch (Exception e) {
                   continue;
                }
            }
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}
