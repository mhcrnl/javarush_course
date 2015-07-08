package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by User on 03.06.15.
 */
public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            Thread.sleep(100);
        }
    }
    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }
    public void print() {
        for (Horse horse: horses) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }
    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner=null;
        for (Horse horse: horses) {
            if (horse.getDistance()>maxDistance) {
                maxDistance=horse.getDistance();
                winner=horse;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }
    public static void main (String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse horse1 = new Horse("Konyaka", 3, 0);
        Horse horse2 = new Horse("Loshadina", 3, 0);
        Horse horse3 = new Horse("Korova", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game.run();
        game.printWinner();
    }
}
