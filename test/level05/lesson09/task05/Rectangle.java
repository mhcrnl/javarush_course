package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top;
    private int left;
    private int width;
    private int height;
    public Rectangle(int top, int left, int width, int height) {
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int top, int left) {
        this.top=top;
        this.left=left;
    }
    public Rectangle(int top, int left, int width) {
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    Rectangle prm = new Rectangle(2,3,10,12);
    public Rectangle() {
        this.top=prm.top;
        this.left=prm.left;
        this.width=prm.width;
        this.height=prm.height;
    }//Напишите тут ваш код

}
