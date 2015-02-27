package com.javarush.test.level08.lesson11.home01;

import org.omg.CORBA.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());
        //Написать тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> catSet = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        //Написать тут ваш код. step 2 - пункт 2
        return catSet;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat text : cats) {
            System.out.println(text);
        }// step 4 - пункт 4
    }

    public static class Cat {
        public Cat() {}
    }

    // step 1 - пункт 1
}
