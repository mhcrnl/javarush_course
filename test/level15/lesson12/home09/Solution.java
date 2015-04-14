package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int ind = url.indexOf("?");
        url = url.substring(ind+1);
        ArrayList<String> params = new ArrayList<String>();
        ArrayList<String> onlyParams = new ArrayList<String>();
        for (int i=0; i<url.length(); i++) {
            ind = url.indexOf("&");
            if (ind!=-1) {
                String param = url.substring(0, ind);
                params.add(param);
                url = url.substring(ind+1);
            }
            else {
                params.add(url);
                url="";
            }

        }
        String onlyParam = "";
        String objValue = "";
        for (String param: params) {
            if (param.contains("=")) {
                onlyParam = param.substring(0, param.indexOf("="));
                if (onlyParam.equals("obj")) {
                    objValue = param.substring(param.indexOf("=")+1);
                }
                onlyParams.add(onlyParam);
            }
            else onlyParams.add(param);
        }
        for (String param: onlyParams) {
            System.out.print(param+" ");
        }
        System.out.print("\n");

        try {
            if (objValue.length()!=0)
            {
                double d = Double.parseDouble(objValue);
                alert(d);
            }
        }
        catch (NumberFormatException e) {
            alert(objValue);
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
