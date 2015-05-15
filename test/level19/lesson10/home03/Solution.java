package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Person person;
        Calendar calendar;
        Date birthday;
        String s;
        String name;
        int day;
        int month;
        int year;
        while ((s=reader.readLine()) != null) {
            year=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
            s=s.substring(0, s.lastIndexOf(" "));
            month=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1))-1;
            s=s.substring(0, s.lastIndexOf(" "));
            day=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
            name=s.substring(0,s.lastIndexOf(" "));
            calendar= new GregorianCalendar(year, month, day);
            birthday=calendar.getTime();
            person=new Person(name, birthday);
            PEOPLE.add(person);
        }
        reader.close();
        for (Person person1: PEOPLE) {
            System.out.println(person1.getName()+" "+person1.getBirthday());
        }
    }
}
