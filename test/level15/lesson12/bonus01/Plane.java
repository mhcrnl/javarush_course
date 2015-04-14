package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by User on 14.04.15.
 */
public class Plane implements Flyable
{
    int passengers;
    public void fly(){};
    Plane (int i) {
        this.passengers = i;
    }
}
