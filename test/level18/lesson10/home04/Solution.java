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
        byte[] buffer = new byte[fis.available()];
        while (fis.available()>0) {
            fis.read(buffer);
        }

        FileInputStream fis2 = new FileInputStream(fileName2);
        byte[] buffer2 = new byte[fis2.available()];
        while (fis2.available()>0) {
            fis2.read(buffer2);
        }
        byte[] result = new byte[buffer.length+buffer2.length];

        System.arraycopy(buffer2, 0, result, 0, buffer2.length);
        System.arraycopy(buffer, 0, result, buffer2.length, buffer.length);


        FileOutputStream fos = new FileOutputStream(fileName1);

        fos.write(result);
        reader.close();
        fis.close();
        fis2.close();
        fos.close();


    }
}
