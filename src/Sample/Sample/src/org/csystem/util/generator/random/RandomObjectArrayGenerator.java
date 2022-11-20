package org.csystem.util.generator.random;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.DateUtil;
import org.csystem.util.datetime.TimeUtil;
import org.csystem.util.string.StringUtil;
import org.csystem.util.wrapper.IntValue;

import java.util.Random;

public class RandomObjectArrayGenerator {
    private final Random m_random;

    //String, Date, Time, IntValue, int[]
    private Object getObject()
    {
        int val = m_random.nextInt(5);

        return switch (val) {
            case 0 -> StringUtil.getRandomTextTR(m_random, m_random.nextInt(5, 10));
            case 1 -> DateUtil.randomDate(m_random);
            case 2 -> TimeUtil.randomTime(m_random);
            case 3 -> IntValue.of(m_random.nextInt(-128, 127));
            default -> ArrayUtil.getRandomArray(m_random, m_random.nextInt(5, 15), 0, 100);
        };
    }

    public RandomObjectArrayGenerator(Random random)
    {
        m_random = random;
    }

    public Object [] getObjects(int count)
    {
        Object [] objects = new Object[count];

        for (int i = 0; i < count; ++i)
            objects[i] = getObject();

        return objects;
    }
}
