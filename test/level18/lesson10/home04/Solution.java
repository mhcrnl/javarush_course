package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName1);
        FileInputStream fis2 = new FileInputStream(fileName2);
        FileOutputStream fos = new FileOutputStream(fileName1);
        byte[] buffer = new byte[fis.available()];
        byte[] buffer2 = new byte[fis2.available()];
        byte[] result = new byte[buffer.length+buffer2.length];
        fis.read(buffer);
        fis2.read(buffer2);
        for (int i=0; i<buffer2.length; i++) {
            result[i] = buffer2[i];
        }
        for (int i=0; i<buffer[i]; i++) {
            result[i+buffer2.length] = buffer[i];
        }
        fos.write(result);
        fis.close();
        fis2.close();
        fos.close();

    }
}
