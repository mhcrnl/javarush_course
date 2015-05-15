package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileSource = args[0];
        String fileDestination = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(fileSource));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileDestination, true));
        String line;
        String[] strings;
        byte[] bytes;
        while ((line=reader.readLine()) != null) {
            strings=line.split(" ");
            for (String s: strings) {
                bytes=s.getBytes();
                for (byte b: bytes) {
                    if (Character.isDigit(b)) {
                        writer.write(s+" ");
                        break;
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
