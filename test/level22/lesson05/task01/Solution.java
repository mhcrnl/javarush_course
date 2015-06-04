package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string==null) throw new TooShortStringException();

        String result = null;
        char[] chars = string.toCharArray();
        int count = 0;
        int index=0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i]==32) {
                count++;
                if (count==5) {
                    index=i;
                    break;
                }
            }
        }
        if (count<5) {
            throw new TooShortStringException();
        }
        else {
            result = string.substring(string.indexOf(" ")+1, index);
        }
        return result;
    }

    public static class TooShortStringException extends Exception {

    }
    public static void main (String[] args) throws TooShortStringException {
        System.out.print(getPartOfString(null));
    }
}
