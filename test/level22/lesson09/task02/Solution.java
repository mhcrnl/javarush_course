package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        System.out.print(sb);
        for (Map.Entry<String, String> pair: params.entrySet()) {
            if (pair.getValue()!=null) {
                if (!sb.toString().equals("")) {
                    sb.append(" and ");
                }
                sb.append(pair.getKey());
                sb.append(" = '");
                sb.append(pair.getValue());
                sb.append("'");
            }
        }
        return sb;
    }
    public  static  void  main (String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.print(getCondition(map));
    }
}
