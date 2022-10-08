/*------------------------------------------------------------------
	FILE		: RandomIntGenerator.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 02.10.2022

	RandomIntGenerator class that creates a random generated array
	once and gives the copy of array

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.generator.random;

import org.csystem.util.array.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

public class RandomIntGenerator {
    private int [] m_numbers;

    public RandomIntGenerator(Random random, int count, int min, int bound)
    {
        m_numbers = ArrayUtil.getRandomArray(random, count, min, bound);
    }

    public int [] getNumbers()
    {
        return Arrays.copyOf(m_numbers, m_numbers.length);
    }
}
