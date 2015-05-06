package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePartName = "";
        String wholeFileName = "";
        FileInputStream fis;
        FileOutputStream fos;
        ArrayList<byte[]> arraysByte = new ArrayList<byte[]>();
        ArrayList<String> list = new ArrayList<String>();
        byte[] buffer=null;

        while (true) {
            filePartName = reader.readLine();
            if (filePartName.equals("end")) break;
            else {
                list.add(filePartName);
                wholeFileName=filePartName.substring(0, filePartName.lastIndexOf("."));
            }
        }
        Collections.sort(list);

        for (String fileName: list) {
            fis = new FileInputStream(fileName);
            buffer = new byte[fis.available()];
            fis.read(buffer);


            fos = new FileOutputStream(wholeFileName, true);
            fos.write(buffer);

            fis.close();
            fos.close();
        }
    }
}
