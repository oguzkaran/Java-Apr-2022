/*------------------------------------------------------------------
	FILE		: MutableIntValue.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 02.12.2022

    MutableIntValue class that wraps an int value

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.wrapper;

public class MutableIntValue {
    private int m_value;

    public MutableIntValue()
    {
    }

    public MutableIntValue(int value)
    {
        m_value = value;
    }

    public int getValue()
    {
        return m_value;
    }

    public MutableIntValue setValue(int value)
    {
        m_value = value;

        return this;
    }

    public MutableIntValue add(int value)
    {
        m_value += value;

        return this;
    }

    public MutableIntValue subtract(int value)
    {
        add(-value);

        return this;
    }

    public MutableIntValue multiply(int value)
    {
        m_value *= value;

        return this;
    }

    public MutableIntValue divide(int value)
    {
        m_value /= value;

        return this;
    }

    public String toString()
    {
        return m_value + "";
    }
    //...
}
