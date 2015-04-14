package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread obj1 = new SpecialThread();
        SpecialThread obj2 = new SpecialThread();
        SpecialThread obj3 = new SpecialThread();
        SpecialThread obj4 = new SpecialThread();
        SpecialThread obj5 = new SpecialThread();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        Thread thread3 = new Thread(obj3);
        Thread thread4 = new Thread(obj4);
        Thread thread5 = new Thread(obj5);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
        //Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }


}
