package com.javarush.test.level17.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
import java.text.DateFormat;
import java.text.ParseException;
=======
>>>>>>> 11cbfbce118bdce059d54d8e1e4975c40bf25b40
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

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
        while (true) {
            String command = reader.readLine();
            if (command.equals(null)) break;
            else {
                String typeOperation = command.substring(0,2);
                if (typeOperation.equals("-c")) {
                    command = command.substring(3);
                    String namePerson = command.substring(0, command.indexOf(" "));
                    command = command.substring(command.indexOf(" ")+1);
                    String sexPerson = command.substring(0,1);

                    command = command.substring((command.indexOf(" ")+1));
                    DateFormat dateBirthdayPerson = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                    Date date=null;
                    try {
                        date = dateBirthdayPerson.parse(command);
                    }
                    catch (ParseException e) {
                    }
                    if (sexPerson.equals("м")) {
                        allPeople.add(Person.createMale(namePerson, date));
                    }
                    else if (sexPerson.equals("ж")) {
                        allPeople.add(Person.createFemale(namePerson, date));
                    }
                }
                else if (typeOperation.equals("-u")) {
                    command = command.substring(command.indexOf(" "+1));
                    int indexPerson = Integer.parseInt(command.substring(0, command.indexOf(" ")));
                    command = command.substring(command.indexOf(" ")+1);
                    String namePerson = command.substring(0, command.indexOf(" "));
                    command = command.substring(command.indexOf(" ")+1);
                    String sexPerson = command.substring(0,1);
                    Sex sex=null;
                    if (sexPerson.equals("м")) sex = Sex.MALE;
                    else if (sexPerson.equals("ж")) sex = Sex.FEMALE;
                    command = command.substring((command.indexOf(" ")+1));
                    DateFormat dateBirthdayPerson = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                    Date date=null;
                    try {
                        date = dateBirthdayPerson.parse(command);
                    }
                    catch (ParseException e) {
                    }
                    allPeople.get(indexPerson).setName(namePerson);
                    allPeople.get(indexPerson).setSex(sex);
                    allPeople.get(indexPerson).setBirthDay(date);
                }
                else if (typeOperation.equals("-d")) {
                    int indexToRemove = Integer.parseInt(command.substring(3));
                    allPeople.remove(indexToRemove);
                }
                else if (typeOperation.equals("-i")) {
                    int indexToGetInfo = Integer.parseInt(command.substring(3));
                    String name = allPeople.get(indexToGetInfo).getName();
                    Sex sex = allPeople.get(indexToGetInfo).getSex();
                    String sexString = "";
                    if (sex==Sex.MALE) {sexString="м";}
                    else {sexString="ж";}
                    Date bd = allPeople.get(indexToGetInfo).getBirthDay();
                    DateFormat dateBirthdayPerson = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
                    String date = dateBirthdayPerson.format(bd);

                    System.out.println(name+" "+sexString+" "+date);
                }
            }

        }
        reader.close();

=======
        String command = reader.readLine();
        String typeOperation = command.substring(0,2);
        command = command.substring(3);
        if (typeOperation.equals("-c")) {
            String name = command.substring(0, command.indexOf(" "));
            command = command.substring(command.indexOf(" ")+1);
            Sex sex = null;
            String sexString = command.substring(0, 1);
            String dateString = command.substring(2);
            Date bd = new Date(dateString);
            if (sexString.equals("м")) {
                Person man = Person.createMale(name, bd);
                allPeople.add(man);
            }
            else if (sexString.equals("ж")) {
                Person woman = Person.createFemale(name, bd);
                allPeople.add(woman);
            }
        }
        else if (typeOperation.equals("-u")) {
            int id = Integer.parseInt(command.substring(0, command.indexOf(" ")));
            Person person = allPeople.get(id);
            command = command.substring(command.indexOf(" ")+1);
            String name = command.substring(0, command.indexOf(" "));
            command = command.substring(command.indexOf(" ")+1);
            Sex sex = null;
            String sexString = command.substring(0, 1);
            String dateString = command.substring(2);
            Date bd = new Date(dateString);

            if (sexString.equals("м")) {
                sex = Sex.MALE;
                person.setSex(sex);
            }
            else if (sexString.equals("ж")) {
                sex = Sex.FEMALE;
                person.setSex(sex);
            }
            person.setName(name);
            person.setBirthDay(bd);
        }
        else if (typeOperation.equals("-d")) {
            int id = Integer.parseInt(command);
            allPeople.remove(id);
        }
        else if (typeOperation.equals("-i")) {
            int id = Integer.parseInt(command);
            Person person = allPeople.get(id);
            Sex sex = person.getSex();
            String sexString = "";
            String format = "dd-MMM-YYYY";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);

            if (sex==Sex.MALE) {
                sexString = "м";
            }
            else if (sex==Sex.FEMALE) {
                sexString = "ж";
            }
            System.out.println(person.getName()+" "+sexString+" "+dateFormat.format(person.getBirthDay()));
        }
>>>>>>> 11cbfbce118bdce059d54d8e1e4975c40bf25b40
        //start here - начни тут
    }
}
