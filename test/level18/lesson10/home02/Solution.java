package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fis = new FileInputStream(fileName);
        int countOfLetters = fis.available();
        int countOfSpace = 0;
        double frequency = 0;
        while (fis.available()>0) {
            int symbol = fis.read();
            if (symbol==32) countOfSpace++;
        }

        if(countOfLetters == 0){

        } else {
            frequency = (double)countOfSpace / countOfLetters * 100;
        }

        System.out.printf("%.2f", frequency);

        fis.close();
    }
}
