package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    static int id=0;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        if (args[0].equals("-c")) {
            Product product = new Product(args[1], args[args.length-2], args[args.length-1]);
            FileOutputStream fos = new FileOutputStream(fileName, true);
            fos.write((product.toString()).getBytes());
            fos.write((byte)10);
            fos.close();
        }
    }
    public static class Product {
        int myId=0;
        String productName;
        String price;
        String quantity;

        Product(String productName, String price, String quantity) {
            id++;
            this.myId=id;
            this.productName=productName;
            this.price=price;
            this.quantity=quantity;
        }

        @Override
        public String toString()
        {
            return String.format("%-8d%-30.30s%-8.8s%-4.4s", myId, productName, price, quantity);
        }
    }
}
