package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Integer) value);
    }
    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Double) value);
    }
    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Short) value);
    }
    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Byte) value);
    }
    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Float) value);
    }
    public static void printMatrix(int m, int n, Long value) {
        System.out.println("Заполняем объектами Long");
        printMatrix(m, n, (Long) value);
    }
    public static void printMatrix(long m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Integer) value);
    }
    public static void printMatrix(int m, long n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Integer) value);
    }
}
