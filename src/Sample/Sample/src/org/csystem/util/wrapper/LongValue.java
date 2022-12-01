/*------------------------------------------------------------------
	FILE		: LongValue.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 01.12.2022

	LongValue class that wraps a long value

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.wrapper;

public final class LongValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final LongValue[] CACHE = new LongValue[CACHE_MAX - CACHE_MIN + 1];
    private final long m_value;

    private LongValue(long value)
    {
        m_value = value;
    }

    public static final LongValue ZERO = of(0);
    public static final LongValue ONE = of(1);
    public static final LongValue TWO = of(2);
    public static final LongValue TEN = of(10);

    public static LongValue of(long value)
    {
        if (value < -128 || 127 < value)
            return new LongValue(value);

        int index = (int)value + 128;

        if (CACHE[index] == null)
            CACHE[index] = new LongValue(value);

        return CACHE[index];
    }

    public long getValue()
    {
        return m_value;
    }

    public int compareTo(LongValue other)
    {
        long diff = m_value - other.m_value;

        if (diff > 0)
            return 1;

        if (diff < 0)
            return -1;

        return 0;
    }

    public LongValue add(LongValue value)
    {
        return add(value.m_value);
    }

    public LongValue add(long value)
    {
        return of(m_value + value);
    }

    public LongValue subtract(LongValue value)
    {
        return subtract(value.m_value);
    }

    public LongValue subtract(long value)
    {
        return add(-value);
    }

    public LongValue multiply(LongValue value)
    {
        return multiply(value.m_value);
    }

    public LongValue multiply(long value)
    {
        return of(m_value * value);
    }

    public LongValue divide(LongValue value)
    {
        return divide(value.m_value);
    }

    public LongValue divide(long value)
    {
        return of(m_value / value);
    }

    public LongValue[] divideAndRemainder(LongValue value)
    {
        return divideAndRemainder(value.m_value);
    }

    public LongValue[] divideAndRemainder(long value)
    {
        LongValue[] result = new LongValue[2];

        result[0] = divide(value);
        result[1] = mod(value);

        return result;
    }

    public LongValue mod(LongValue value)
    {
        return mod(value.m_value);
    }

    public LongValue mod(long value)
    {
        return of(m_value % value);
    }

    public LongValue inc()
    {
        return add(1);
    }

    public LongValue dec()
    {
        return subtract(1);
    }

    public String toString()
    {
        return m_value + "";
    }
}
