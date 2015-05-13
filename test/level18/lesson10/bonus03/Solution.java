package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

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
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        File file = new File(fileName);
        bufferedReader.close();

        if (args[0].equals("-u")) {
            update(file, args);
        } else if (args[0].equals("-d")) {
            delete(file, args[1]);
        } else return;
    }

    private static File update(File fileName, String[] array) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line="";
        File fileTemp = new File("C:/fileTemp.txt");
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileTemp, true)));


        while ((line=bufferedReader.readLine()) != null) {
            String temp = line.substring(0, 8).replaceAll("\\s", "");
            if (temp.equals(array[1])) {
                String productName = "";
                for (int i = 2; i < array.length-2; i++)
                    productName = productName + array[i] + " ";
                String newProductName = setSpaces(productName, 30);
                String newPrice = setSpaces(array[array.length-2], 8);
                String newQuantity = setSpaces(array[array.length-1], 4);
                String newId = setSpaces(array[1], 8);
                printWriter.println(newId+newProductName+newPrice+newQuantity);
            }
            else {
                printWriter.println(line);
            }
        }
        bufferedReader.close();
        printWriter.close();
        fileName.delete();
        fileTemp.renameTo(fileName);
        return fileTemp;
    }

    private static File delete(File fileName, String id) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line="";
        File fileTemp = new File("C:/fileTemp.txt");
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileTemp, true)));
        while ((line=bufferedReader.readLine()) != null) {
            String temp = line.substring(0, 8).replaceAll("\\s", "");
            if (!temp.equals(id)) {
                printWriter.println(line);
            }
            else {
                continue;
            }
        }
        bufferedReader.close();
        printWriter.close();
        fileName.delete();
        fileTemp.renameTo(fileName);
        return fileTemp;
    }

    public static String setSpaces (String previousName, int count) {
        String trueName;
        if (previousName.length()>count)
            trueName = previousName.substring(0, count);
        else
        {
            String s="";
            for (int i = 0; i < (count  - previousName.length()); i++)
                s = s+ " ";
            trueName = previousName+s;
        }
        return trueName;
    }
}
