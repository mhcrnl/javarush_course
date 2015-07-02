package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример, "мор"-"ром", "трос"-"сорт"
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String string;

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        while ((string = reader1.readLine()) != null) {
            String[] words = string.split(" ");
            for (int i=0; i<words.length; i++) {
                StringBuilder reverseWord = new StringBuilder(words[i]).reverse();
                if (!reverseWord.toString().equals(words[i])) {
                    for (int j=0; j<words.length; j++) {
                        if (reverseWord.toString().equals(words[j])) {
                            boolean isThereThisWord = false;
                            for (Pair pair: result) {
                                if (pair.first.equals(words[j]) || pair.second.equals(words[j])){
                                    isThereThisWord=true;
                                }
                            }
                            if (!isThereThisWord) {
                                Pair pair1 = new Pair(words[i], words[j]);
                                result.add(pair1);
                            }
                        }
                    }
                }

            }
        }
        reader.close();
        reader1.close();
        for (Pair pair: result) {
            System.out.println(pair.toString());
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair (String first, String second) {
            this.first=first;
            this.second=second;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
