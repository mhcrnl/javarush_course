package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен
иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human man1 = new Human("nick");
        Human man2 = new Human(true);
        Human man3 = new Human("nick", "bolton", 18);
        Human man4 = new Human("nick", "bolton", "San Francisco", 19, "Bentley", true);
        Human man5 = new Human("nick", 20);
        Human man6 = new Human("nick", "bolton", "San Francisco");
        Human man7 = new Human("nick", "bolton", "San Francisco", 19);
        Human man8 = new Human("nick", "Bentley");
        Human man9 = new Human(19, true);
        Human man10 = new Human("nick", true);


    }

    public static class Human
    {
        private String firstName;
        private String lastName;
        private String address;
        private int age;
        private String car;
        private boolean manOrWoman;

        public Human (String firstName, String lastName, String address, int age, String car, boolean manOrWoman) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.car = car;
            this.manOrWoman = manOrWoman;
        }
        Human (String firstName) {
            this.firstName = firstName;
        }

        Human (boolean manOrWoman) {
            this.manOrWoman = manOrWoman;
        }
        Human (String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        Human (String firstName, String lastName, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
        Human (String firstName, String lastName, String address, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
        }
        public Human (String firstName, String car) {
            this.firstName = firstName;
            this.car = car;
        }
        public Human (int age, boolean manOrWoman) {
            this.age = age;
            this.manOrWoman = manOrWoman;
        }
        public Human (String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }
        public Human (String firstName, boolean manOrWoman) {
            this.firstName = firstName;
            this.manOrWoman = manOrWoman;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
