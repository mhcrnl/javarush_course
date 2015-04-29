package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        FileOutputStream outputStream1 = new FileOutputStream(fileName3);
        while (inputStream.available()>0) {
            byte[] buffer = new byte[inputStream.available()];
            int length = inputStream.read(buffer);
            if (length%2==0) {
                outputStream.write(buffer, 0, length/2);
                outputStream1.write(buffer, 0, length/2);
            }
            else if (length%2==1) {
                outputStream.write(buffer, 0, (length/2)+1);
                outputStream1.write(buffer, 0, length/2);
            }
        }
        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
