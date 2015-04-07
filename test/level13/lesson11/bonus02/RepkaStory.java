package com.javarush.test.level13.lesson11.bonus02;

import java.util.List;

public class RepkaStory
{
    static void tell(List<Person> items) {

        Person first;
        Person second;
<<<<<<< HEAD
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            first.pull(second);
=======
        for (int i = items.size()-1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
>>>>>>> 94bc308cbb890562561fdb13906956b26bfd92aa
        }
    }
}
