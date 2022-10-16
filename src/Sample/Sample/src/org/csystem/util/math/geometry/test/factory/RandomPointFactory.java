package org.csystem.util.math.geometry.test.factory;

import org.csystem.util.math.geometry.MutablePoint;
import org.csystem.util.math.geometry.Point;

import java.util.Random;

public class RandomPointFactory {
    private final Random m_random;

    public RandomPointFactory()
    {
        m_random = new Random();
    }

    public RandomPointFactory(Random random)
    {
        m_random = random;
    }

    public Point createRandomPoint(double min, double bound)
    {
        return Point.createCartesian(m_random.nextDouble(min, bound), m_random.nextDouble(min, bound));
    }

    public MutablePoint createRandomMutablePoint(double min, double bound)
    {
        return MutablePoint.createCartesian(m_random.nextDouble(min, bound), m_random.nextDouble(min, bound));
    }
}
