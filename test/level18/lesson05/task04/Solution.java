package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        while (inputStream.available()>0) {
            byte[] buffer = new byte[inputStream.available()];
            byte[] bufferReverse = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i=0; i<buffer.length; i++) {
                bufferReverse[bufferReverse.length-1-i] = buffer[i];
            }
            outputStream.write(bufferReverse);
        }
        inputStream.close();
        outputStream.close();
    }
}
