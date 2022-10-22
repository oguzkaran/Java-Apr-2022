package org.csystem.util.math.test.factory;

import org.csystem.util.math.Fraction;

import java.util.Random;

public class RandomFractionFactory {
    private final Random m_random;

    private int getValidDenominator(int min, int bound)
    {
        int val;

        while ((val = m_random.nextInt(min, bound)) == 0)
            ;

        return val;
    }

    public RandomFractionFactory()
    {
        m_random = new Random();
    }

    public RandomFractionFactory(Random random)
    {
        m_random = random;
    }

    public Fraction createRandomFraction(int min, int bound)
    {
        return new Fraction(m_random.nextInt(min, bound), m_random.nextInt(min, bound));
    }

    public Fraction createRandomValidFraction(int min, int bound)
    {
        return new Fraction(m_random.nextInt(min, bound), getValidDenominator(min, bound));
    }
}
