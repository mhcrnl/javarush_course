package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        if (args[0].equals("-c"))
        {
            create(args);
        } else if (args[0].equals("-u"))
        {
            update(args);
        } else if (args[0].equals("-d"))
        {
            delete(args);
        } else if (args[0].equals("-i"))
        {
            select(args);
        } else return;
    }

    public synchronized static void create (String array[]) throws ParseException
    {
        int i=1;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        while ( i < array.length) {
            if (array[i].equals("м")) {
                String name = array[i-1];
                String bd = array[i+1];
                Person man = Person.createMale(name, format1.parse(bd));
                allPeople.add(man);
                System.out.println(allPeople.indexOf(man));
            }
            if (array[i].equals("ж")) {
                String name = array[i-1];
                String bd = array[i+1];
                Person woman = Person.createFemale(name, format1.parse(bd));
                allPeople.add(woman);
                System.out.println(allPeople.indexOf(woman));
            }
            i++;
        }
    }
    public synchronized static void update(String array[]) throws ParseException
    {
        int id;
        String name = null;
        String bd = null;
        Person person = null;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int i=1;

        while ( i < array.length) {
            if (array[i].equals("м")) {
                bd = array[i+1];
                name = array[i-1];
                id = Integer.parseInt(array[i - 2]);
                if (id < allPeople.size()) {
                    person = allPeople.get(id);
                }
                else return;
                person.setName(name);
                person.setSex(Sex.MALE);
                person.setBirthDay(format1.parse(bd));
            }
            if (array[i].equals("ж")) {
                bd = array[i+1];
                name = array[i-1];
                id = Integer.parseInt(array[i-2]);
                person = Person.createFemale(name, format1.parse(bd));
                allPeople.set(id, person);
            }
            i++;
        }
    }
    public static void select(String array[])
    {
        Person person;
        for (int i=1; i<array.length; i++) {
            int id = Integer.parseInt(array[i]);
            if (id < allPeople.size()) {
                person = allPeople.get(id);
                String sex = person.getSex() == Sex.MALE ? "м" : "ж";
                SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String bd = format2.format(person.getBirthDay());
                System.out.println(person.getName() + " " + sex + " " + bd);
            }
        }
    }

    public synchronized static void delete(String array[])
    {
        for (int i=1; i<array.length; i++) {
            int id = Integer.parseInt(array[i]);
            if (id < allPeople.size()) {
                Person person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
            }
        }
    }
}
