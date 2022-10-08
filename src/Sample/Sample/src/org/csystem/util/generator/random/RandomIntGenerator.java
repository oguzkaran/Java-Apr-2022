/*------------------------------------------------------------------
	FILE		: RandomIntGenerator.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 02.10.2022

	RandomIntGenerator class that creates a random generated array
	once

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.generator.random;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class RandomIntGenerator {
    private int [] m_numbers;

    public RandomIntGenerator(Random random, int count, int min, int bound)
    {
        m_numbers = ArrayUtil.getRandomArray(random, count, min, bound);
    }

    public int getCount()
    {
        return m_numbers.length;
    }

    public int get(int index)
    {
        return m_numbers[index];
    }
}
