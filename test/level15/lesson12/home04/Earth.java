package com.javarush.test.level15.lesson12.home04;

/**
 * Created by User on 10.04.15.
 */
public class Earth implements Planet
{
    private static Earth instance;
    private Earth(){
    }

    public static Earth getInstance()
    {
        if (instance==null) {
            instance = new Earth();
        }
        return instance;
    }
}
