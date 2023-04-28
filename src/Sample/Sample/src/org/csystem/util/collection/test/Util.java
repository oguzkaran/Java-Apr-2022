package org.csystem.util.collection.test;

import java.util.Random;

class Util {
    public static String createRandomHost(Random random)
    {
        return String.format("%d.%d.%d.%d", random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}