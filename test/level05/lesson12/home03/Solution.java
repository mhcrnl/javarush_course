package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse jerrySon = new Mouse("son", 10 , 5);
        Mouse jerrygrandma = new Mouse("grandma", 12 , 50);
        Dog bulldog = new Dog("Bulldog", 12, 12, 12);
        Dog dog = new Dog("Dog", 12, 12, 12);
        Dog unknown = new Dog("дворняжка", 12, 12, 12);
        Cat tom = new Cat("Том", 12, 12);

        //Напишите тут ваш код
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;
        int strength;

        public Dog(String name, int height, int tail, int strength)
        {
            this.name = name;
            this.height = height;
            this.strength = strength;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int strength;

        public Cat(String name, int height, int strength)
        {
            this.name = name;
            this.height = height;
            this.strength = strength;
        }
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //Напишите тут ваши классы

}
