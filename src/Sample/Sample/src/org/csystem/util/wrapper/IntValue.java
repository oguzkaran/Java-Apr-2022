/*------------------------------------------------------------------
	FILE		: IntValue.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 15.10.2022

	IntValue classs

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.wrapper;

public class IntValue {
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static IntValue of(int value)
    {
        if (value < -128 || 127 < value)
            return new IntValue(value);

        //TODO: Cache'e bak yoksa yarat, varsa olanın referansına dön

        return new IntValue(0);
    }

    public int getValue()
    {
        return m_value;
    }



    public String toString()
    {
        return m_value + "";
    }
}
