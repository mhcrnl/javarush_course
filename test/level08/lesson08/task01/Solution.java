package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main (String args[]) {
        HashSet<String> hash = createSet();
        for ( String s : hash) {
            System.out.println(s);
        }
    }
    public static HashSet<String> createSet()
    {
        HashSet<String> hash = new HashSet<String>();
        hash.add("Лена");
        hash.add("Ленб");
        hash.add("Ленв");
        hash.add("Ленг");
        hash.add("Ленд");
        hash.add("Лене");
        hash.add("Ленж");
        hash.add("Ленз");
        hash.add("Лени");
        hash.add("Ленй");
        hash.add("Ленк");
        hash.add("Ленл");
        hash.add("Ленм");
        hash.add("Ленн");
        hash.add("Лено");
        hash.add("Ленп");
        hash.add("Ленр");
        hash.add("Ленс");
        hash.add("Лент");
        hash.add("Ленф");
        return hash;
        //Напишите тут ваш код
    }

}
