package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Вася", true, 2, null);
        Human child2 = new Human("Ваня", true, 4);
        Human child3 = new Human("Варя", false, 6);
        ArrayList<Human> mamPapChildren = new ArrayList<Human>();
        mamPapChildren.add(child1);
        mamPapChildren.add(child2);
        mamPapChildren.add(child3);
        Human mama = new Human("Вера", false, 29, mamPapChildren);
        Human papa = new Human("Сергей", true, 29, mamPapChildren);
        ArrayList<Human> dedBabChildren1 = new ArrayList<Human>();
        dedBabChildren1.add(papa);
        ArrayList<Human> dedBabChildren2 = new ArrayList<Human>();
        dedBabChildren2.add(mama);
        Human ded1 = new Human("Степан", true, 72, dedBabChildren1);
        Human baba1 = new Human("Степанида", false, 72, dedBabChildren1);
        Human ded2 = new Human("Степан", true, 72, dedBabChildren2);
        Human baba2 = new Human("Степанка", false, 72, dedBabChildren2);
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        //Написать тут ваш код
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.children!=null) {
                int childCount = this.children.size();
                if (childCount > 0)
                {
                    text += ", дети: "+this.children.get(0).name;

                    for (int i = 1; i < childCount; i++)
                    {
                        Human child = this.children.get(i);
                        text += ", "+child.name;
                    }
                }
            }
            return text;
        }
    }

}
