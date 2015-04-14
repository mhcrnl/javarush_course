package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution() {
        System.out.print("default access constructor");
    }
    Solution(String s) {
        System.out.print("default access constructor");
    }
    Solution(int i) {
        System.out.print("default access constructor");
    }
    private Solution(double d) {
        System.out.print("private constructor");
    }
    private Solution(String s, int i) {
        System.out.print("private constructor");
    }
    private Solution(long i) {
        System.out.print("private constructor");
    }
    protected Solution(boolean b) {
        System.out.print("protected constructor");
    }
    protected Solution(int i, int j) {
        System.out.print("protected constructor");
    }
    protected Solution(boolean b, long l) {
        System.out.print("protected constructor");
    }
    public Solution(String s,String ss,String sss) {
        System.out.print("default access constructor");
    }
    public Solution(String s, String d) {
        System.out.print("default access constructor");
    }
    public Solution(int i, int j, int k) {
        System.out.print("default access constructor");
    }
}

