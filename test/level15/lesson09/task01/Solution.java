package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(200d,"sss");
        labels.put(300d,"s");
        labels.put(400d,"ss");
        labels.put(500d,"ssss");
        labels.put(600d,"sssss");
    }
}
