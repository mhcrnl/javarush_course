package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string==null || string.isEmpty()) throw new TooShortStringException();
        String result=null;
        int firstTabIndex = string.indexOf("\t");
        if (firstTabIndex==-1) {
            throw new TooShortStringException();
        }
        else {
            int secondTabIndex = string.indexOf("\t", firstTabIndex+1);
            if (secondTabIndex==-1) {
                throw new TooShortStringException();
            }
            else {
                result = string.substring(firstTabIndex+1, secondTabIndex);
            }

        }
        return result;
    }

    public static class TooShortStringException extends Exception {
    }
    public static void main (String[] args) throws TooShortStringException {
        System.out.print(getPartOfString(""));
    }
}
