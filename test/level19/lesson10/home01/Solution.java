package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String s;
        String name;
        Double value;
        while ((s=reader.readLine()) != null) {
            name=s.substring(0, s.indexOf(" "));
            value=Double.parseDouble(s.substring(s.indexOf(" ")+1));
            if (!map.containsKey(name)) {
                map.put(name, value);
            }
            else {
                map.put(name, map.get(name)+value);
            }
        }
        for (Map.Entry<String, Double> pair: map.entrySet()) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
        reader.close();
    }
}
