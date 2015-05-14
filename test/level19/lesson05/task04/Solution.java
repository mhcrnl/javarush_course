package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
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
        String sign = "!";
        while (reader1.ready()) {
            s=reader1.readLine();
            String ss=s.replaceAll("\\.", sign);
            writer.write(ss);
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}
