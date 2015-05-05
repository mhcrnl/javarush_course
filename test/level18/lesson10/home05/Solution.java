package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader reader2 = new BufferedReader(new FileReader(fileName1));
        String result = "";
        while (true) {
            String readString=reader2.readLine();
            if (readString==null) break;
            else result += readString;
        }

        String[] floatNumberAsString = result.split(" ");
        FileWriter fw = new FileWriter(fileName2);


        for (String s: floatNumberAsString) {
            fw.write((int)Math.round(Double.parseDouble(s))+" ");
        }



        reader.close();
        reader2.close();
        fw.close();
    }
}
