package com.javarush.test.level17.lesson10.home01;

import java.util.*;

/* Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
*/

public class Solution implements List{
    private ArrayList<Long> original = new ArrayList<Long>();
    @Override
    public synchronized Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public synchronized boolean add(Object o)
    {
        return false;
    }

    @Override
    public synchronized Object remove(int index)
    {
        return null;
    }

    @Override
    public synchronized void add(int index, Object element)
    {

    }

    @Override
    public synchronized int lastIndexOf(Object o)
    {
        return 0;
    }

    @Override
    public synchronized boolean remove(Object o)
    {
        return false;
    }

    @Override
    public synchronized boolean addAll(Collection c)
    {
        return false;
    }

    @Override
    public synchronized int indexOf(Object o)
    {
        return 0;
    }

    @Override
    public synchronized boolean containsAll(Collection c)
    {
        return false;
    }

    @Override
    public synchronized boolean isEmpty()
    {
        return false;
    }

    @Override
    public synchronized List subList(int fromIndex, int toIndex)
    {
        return null;
    }

    @Override
    public synchronized ListIterator listIterator(int index)
    {
        return null;
    }

    @Override
    public synchronized int size()
    {
        return 0;
    }

    @Override
    public synchronized boolean contains(Object o)
    {
        return false;
    }

    @Override
    public synchronized Object set(int index, Object element)
    {
        return null;
    }

    @Override
    public synchronized Iterator iterator()
    {
        return null;
    }

    @Override
    public synchronized boolean retainAll(Collection c)
    {
        return false;
    }

    @Override
    public synchronized void clear()
    {

    }

    @Override
    public synchronized Object get(int index)
    {
        return null;
    }

    @Override
    public synchronized boolean addAll(int index, Collection c)
    {
        return false;
    }

    @Override
    public synchronized ListIterator listIterator()
    {
        return null;
    }

    @Override
    public Long[] toArray(Object[] a)
    {
        return new Long[0];
    }

    @Override
    public synchronized boolean removeAll(Collection c)
    {
        return false;
    }

}
