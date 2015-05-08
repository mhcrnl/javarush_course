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

import java.io.*;

public class Solution {
    static int id=0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        if (args[0].equals("-c")) {
            id++;
            String productName="";
            for (int i = 1; i < args.length - 2; i++) {
                productName  = productName + args[i] + " ";
            }
            Product product = new Product(productName, args[args.length - 2], args[args.length - 1]);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(product+"\n");
            writer.close();
        }
        reader.close();
    }
    public static class Product {
        int myId=0;
        String productName;
        String price;
        String quantity;

        Product(String productName, String price, String quantity) {
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
