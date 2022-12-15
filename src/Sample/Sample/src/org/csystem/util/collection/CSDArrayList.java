/*------------------------------------------------------------------
	FILE		: CSDArrayList.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 15.12.2022

	CSDArrayList class that represents dynamic array

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.collection;

import java.util.Arrays;

public class CSDArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_objs;
    private int m_index;

    private static void doForIllegalArgumentException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemlerine sabredin
    }

    private static void doForIndexOutOfBoundsException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemlerine sabredin
    }

    public void checkIndex(int index)
    {
        if (index < 0 || index >= m_index)
            doForIndexOutOfBoundsException("Index out of range:" + index);
    }
    private static void checkCapacity(int capacity)
    {
        if (capacity < 0)
            doForIllegalArgumentException("Capacity value not negative:" + capacity);
    }

    private void changeCapacity(int capacity)
    {
        m_objs = Arrays.copyOf(m_objs, capacity);
    }

    public CSDArrayList()
    {
        m_objs = new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_objs = new Object[initialCapacity];
    }

    public boolean add(Object o)
    {
        if (m_objs.length == m_index)
            changeCapacity(m_objs.length == 0 ? 1 : m_objs.length * 2);

        m_objs[m_index++] = o;

        return true;
    }

    public void add(int index, Object o)
    {
        if (m_objs.length == m_index)
            changeCapacity(m_objs.length == 0 ? 1 : m_objs.length * 2);

        //TODO:
    }

    public int capacity()
    {
        return m_objs.length;
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_objs[i] = null;

        m_index = 0;
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_objs.length)
            changeCapacity(Math.max(m_objs.length * 2, minCapacity));
    }

    public Object get(int index)
    {
        checkIndex(index);

        return m_objs[index];
    }

    public boolean isEmpty()
    {
        return m_index == 0;
    }

    public Object remove(int index)
    {
        //TODO:
        Object old = m_objs[index];

        //TODO:

        return old;
    }

    public Object set(int index, Object o)
    {
        checkIndex(index);
        Object old = m_objs[index];

        m_objs[index] = o;

        return old;
    }

    public int size()
    {
        return m_index;
    }

    public void trimToSize()
    {
        if (m_index != m_objs.length)
            changeCapacity(m_index);
    }
}
