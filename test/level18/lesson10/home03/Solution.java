package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName2);
        FileInputStream fis2 = new FileInputStream(fileName3);
        FileOutputStream fos = new FileOutputStream(fileName1);
        byte[] buffer = new byte[fis.available()];
        byte[] buffer2 = new byte[fis2.available()];
        fis.read(buffer);
        fis2.read(buffer2);
        fos.write(buffer);
        fos.write(buffer2);
        fis.close();
        fis2.close();
        fos.close();

    }
}
