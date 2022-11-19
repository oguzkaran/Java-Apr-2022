package org.csystem.util.math.geometry.test.factory;

import org.csystem.util.math.geometry.AnalyticalCircle;
import org.csystem.util.math.geometry.MutablePoint;
import org.csystem.util.math.geometry.Point;

import java.util.Random;

public class RandomAnalyticalCircleFactory {
    private final Random m_random;

    public RandomAnalyticalCircleFactory()
    {
        m_random = new Random();
    }

    public RandomAnalyticalCircleFactory(Random random)
    {
        m_random = random;
    }

    public AnalyticalCircle createAnalyticalCircle(double min, double bound)
    {
        return new AnalyticalCircle(m_random.nextDouble(min, bound), m_random.nextDouble(min, bound), m_random.nextDouble(min, bound));
    }
}
