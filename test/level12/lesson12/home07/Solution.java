package com.javarush.test.level12.lesson12.home07;

/* Fly, Run, Swim для классов Duck, Penguin, Toad
Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }

    abstract class Duck implements Fly, Run, Swim
    {

    }

    abstract class Penguin implements Run, Swim
    {

    }

    abstract class Toad implements Swim
    {

    }
}
