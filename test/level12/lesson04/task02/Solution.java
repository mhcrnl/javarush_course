package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(5);
        print(6);

    }
    public static int print(int a) {return a;}
    public static Integer print(Integer ai) {return ai;}

    //Напишите тут ваши методы
}
