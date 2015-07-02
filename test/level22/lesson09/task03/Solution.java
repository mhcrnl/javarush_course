package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        String string = reader1.readLine();
        String[] words = string.split(" ");
        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<words.length; i++) {
            sb.append(words[i]);
            for (int j=0; j<words.length; j++) {
                char end = sb.charAt(sb.length()-1);
                char begin = words[j].charAt(0);
                if (end==begin) {
                    sb.append(" ");
                    sb.append(words[j]);
                }
            }
        }
        return sb;
    }
}
