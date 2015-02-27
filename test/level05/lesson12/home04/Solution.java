package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        Day myDay = new Day(26, 01, 2015);
        System.out.println(myDay.day+ " 0"+myDay.month+" "+myDay.year);//Напишите тут ваш код
    }

    public static class Day {
        private int day;
        private int month;
        private int year;

        public Day(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
