package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by User on 08.04.15.
 */
class Singleton
{
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance()
    {
        return instance;
    }
}
