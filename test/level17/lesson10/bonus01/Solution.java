package com.javarush.test.level17.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 5 || args.length == 3)
            return;
        int id;
        String name = null;
        String sex = null;
        String bd = null;
        Date date;
        Person person = null;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args[0].equals("-c"))
        {
            if (args.length < 4)
                return;
            if (args.length == 4)
            {
                name = args[1];
                sex = args[2];
                bd = args[3];
            }
            if (args.length == 5)
            {
                name = args[1] + " " + args[2];
                sex = args[3];
                bd = args[4];
            }
            try
            {
                if (sex.equals("м"))
                    person = Person.createMale(name, format1.parse(bd));
                if (sex.equals("ж"))
                    person = Person.createFemale(name, format1.parse(bd));
            }
            catch (ParseException e)
            {
                //
            }
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        }
        else if (args[0].equals("-u"))
        {
            if (args.length < 5)
                return;
            id = Integer.parseInt(args[1]);
            if (args.length == 5)
            {
                name = args[2];
                sex = args[3];
                bd = args[4];
            }
            if (args.length == 6)
            {
                name = args[3] + " " + args[4];
                sex = args[4];
                bd = args[5];
            }
            try
            {
                if (sex.equals("м"))
                    person = Person.createMale(name, format1.parse(bd));
                if (sex.equals("ж"))
                    person = Person.createFemale(name, format1.parse(bd));
            }
            catch (ParseException e)
            {
                //
            }
            allPeople.set(id, person);
        }
        else if (args[0].equals("-d"))
        {
            if (args.length < 2)
                return;
            id = Integer.parseInt(args[1]);
            Person personNull = Person.createFemale(null, null);
            personNull.setSex(null);
            allPeople.set(id, personNull);
        }
        else if (args[0].equals("-i"))
        {
            if (args.length < 2)
                return;
            id = Integer.parseInt(args[1]);
            person = allPeople.get(id);
            name = person.getName();
            sex = person.getSex() == Sex.MALE ? "м" : "ж";
            date = person.getBirthDay();
            System.out.println(name + " " + sex + " " + format2.format(date));
        }
    }
}
