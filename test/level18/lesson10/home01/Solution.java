package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = args[0];
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);

        byte[] alphabet = new byte[52];
        byte begin=65;
        for (int i=0; i<26; i++) {
            alphabet[i] = begin;
            begin++;
        }
        begin = 97;
        for (int i=26; i<52; i++) {
            alphabet[i] = begin;
            begin++;
        }
        int count=0;
        for (int i=0; i<buffer.length; i++) {
            for (int j=0; j<alphabet.length; j++) {
                if(buffer[i]==alphabet[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        fis.close();
    }
}
