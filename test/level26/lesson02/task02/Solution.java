package com.javarush.test.level26.lesson02.task02;

import java.util.*;

/* Был бы ум - будет и успех.
Солдаты всегда строились, строятся и будут строиться по убыванию роста.
Отсортируйте солдат, предварительно подумав, что лучше использовать при таких условиях - Comparable или Comparator.
*/
public class Solution {
    public static void main(String[] args) {
        Set<Soldier> soldiers = new TreeSet<>();
        soldiers.add(new Soldier("Ivanov", 170));
        soldiers.add(new Soldier("Petrov", 180));
        soldiers.add(new Soldier("Sidorov", 175));

        List<Soldier> sortedSolders = new ArrayList<Soldier>(soldiers);
        Collections.sort(sortedSolders);
        for (Soldier soldier : sortedSolders) {
            System.out.println(soldier.name);
        }
    }

    public static class Soldier implements Comparable<Soldier>{
        private String name;
        private int height;

        @Override
        public int compareTo(Soldier o)
        {
            return o.height - this.height;
        }

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
