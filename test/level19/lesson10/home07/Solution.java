package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileSource = args[0];
        String fileDestination = args[1];
        String line;
        String[] strings=null;
        boolean firstFlag = true;

        BufferedReader reader = new BufferedReader(new FileReader(fileSource));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileDestination, true));

        while ((line=reader.readLine()) != null) {
            strings = line.split(" ");
            for (String word : strings)
            {
                if (word.length() > 6)
                {
                    if (!firstFlag)
                        writer.write(',');
                    writer.write(word);
                    firstFlag = false;
                }
            }
        }

        reader.close();
        writer.close();
    }
}

