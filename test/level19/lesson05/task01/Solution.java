package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        String destinationFile = reader.readLine();
        FileInputStream reader1 = new FileInputStream(sourceFile);
        FileOutputStream writer = new FileOutputStream(destinationFile, true);
        byte[] buffer = new byte[reader1.available()];
        reader1.read(buffer);
        for (int j=0; j<buffer.length; j++) {
            if (j%2!=0) writer.write(buffer[j]);
        }
        reader.close();
        reader1.close();
        writer.close();
    }
}
