package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(sourceFile));
        String s="";
        String template = "world";
        int count=0;
        while (reader1.ready()) {
            s=reader1.readLine();
            s=s.replaceAll("\\p{P}", " ");
            String[] temp = s.split(" ");
            for (String ss: temp) {
                if (template.equals(ss)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        reader.close();
        reader1.close();
    }
}
