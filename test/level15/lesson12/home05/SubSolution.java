package com.javarush.test.level15.lesson12.home05;

/**
 * Created by User on 10.04.15.
 */
public class SubSolution extends Solution
{
    SubSolution()
    {
    }

    SubSolution(String s)
    {
        super(s);
    }

    SubSolution(int i)
    {
        super(i);
    }

    protected SubSolution(boolean b)
    {
        super(b);
    }

    protected SubSolution(int i, int j)
    {
        super(i, j);
    }

    protected SubSolution(boolean b, long l)
    {
        super(b, l);
    }

    public SubSolution(String s, String ss, String sss)
    {
        super(s, ss, sss);
    }

    public SubSolution(String s, String d)
    {
        super(s, d);
    }

    public SubSolution(int i, int j, int k)
    {
        super(i, j, k);
    }
    private SubSolution(double d) {
        System.out.print("private constructor");
    }
    private SubSolution(String s, int i) {
        System.out.print("private constructor");
    }
    private SubSolution(long i) {
        System.out.print("private constructor");
    }
}
