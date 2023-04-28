/*------------------------------------------------------------------
	FILE		: CSDArrayList.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 28.04.2023

	CSDArrayList class that represents dynamic array

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.collection;

import java.util.Arrays;

public class CSDArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E [] m_elements;
    private int m_index;

    private static void doForIllegalArgumentException(String message)
    {
        throw new IllegalArgumentException(message);
    }

    private static void doForIndexOutOfBoundsException(String message)
    {
        throw new IndexOutOfBoundsException(message);
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
        m_elements = Arrays.copyOf(m_elements, capacity);
    }

    public CSDArrayList()
    {
        m_elements = (E[])new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_elements = (E[])new Object[initialCapacity];
    }

    public boolean add(E element)
    {
        if (m_elements.length == m_index)
            changeCapacity(m_elements.length == 0 ? 1 : m_elements.length * 2);

        m_elements[m_index++] = element;

        return true;
    }

    public void add(int index, E element)
    {
        if (m_elements.length == m_index)
            changeCapacity(m_elements.length == 0 ? 1 : m_elements.length * 2);

        //TODO:
    }

    public int capacity()
    {
        return m_elements.length;
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elements[i] = null;

        m_index = 0;
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_elements.length)
            changeCapacity(Math.max(m_elements.length * 2, minCapacity));
    }

    public E get(int index)
    {
        checkIndex(index);

        return m_elements[index];
    }

    public boolean isEmpty()
    {
        return m_index == 0;
    }

    public E remove(int index)
    {
        //TODO:
        E old = m_elements[index];

        //TODO:

        return old;
    }

    public E set(int index, E element)
    {
        checkIndex(index);
        E old = m_elements[index];

        m_elements[index] = element;

        return old;
    }

    public int size()
    {
        return m_index;
    }

    public void trimToSize()
    {
        if (m_index != m_elements.length)
            changeCapacity(m_index);
    }

    public String toString()
    {
        String str = "[";

        for (int i = 0; i < m_index; ++i) {
            if (str.length() != 1)
                str += ", ";

            str += m_elements[i];
        }

        return str + "]";
    }
}
