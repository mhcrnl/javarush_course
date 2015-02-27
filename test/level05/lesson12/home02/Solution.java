package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("Василий Алибабаевич", 16, "Бездомный");
        Man man2 = new Man("Алибаба Васильевич", 18, "Зеленая, 10");
        Woman woman1 = new Woman("Куся кукуся", 16, "Тверская,5");
        Woman woman2 = new Woman("Міза Марміза", 16, "Большая Окружная,15");

        // Выведи их на экран тут
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        private String name="Безымянный";
        private int age;
        private String address="Бездомный";
        public Man(String name,int age,String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Man(String name,int age) {
            this.name=name;
            this.age=age;
        }
        public Man(String name,String address) {
            this.name=name;
            this.address=address;
        }
        public Man(int age,String address) {
            this.age=age;
            this.address=address;
        }
        public Man(int age) {
            this.age=age;
        }
        public Man(String name) {
            this.name=name;
        }
    }

    public static class Woman {
        private String name="Безымянная";
        private int age;
        private String address="Бомжиха";
        public Woman(String name, int age, String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Woman(String name,int age) {
            this.name=name;
            this.age=age;
        }
        public Woman(String name,String address) {
            this.name=name;
            this.address=address;
        }
        public Woman(int age,String address) {
            this.age=age;
            this.address=address;
        }
        public Woman(String name) {
            this.name=name;
        }
        public Woman(int age) {
            this.age=age;
        }

    }


    // Напиши тут свои классы
}
