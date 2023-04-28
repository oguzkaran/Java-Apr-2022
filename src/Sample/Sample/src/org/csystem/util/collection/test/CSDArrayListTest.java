package org.csystem.util.collection.test;

import org.csystem.util.collection.CSDArrayList;
import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;
import org.csystem.util.tuple.Pair;
import org.csystem.util.tuple.test.Sensor;

import java.util.Random;

public class CSDArrayListTest {
    public static void run()
    {
        CSDArrayList<Pair<String, Sensor>> sensors = new CSDArrayList<>();
        Random random = new Random();
        int count = Console.readInt("Bir sayı giriniz:");

        while (count-- > 0) {
            String name = StringUtil.getRandomTextTR(random, random.nextInt(5, 16));
            sensors.add(Pair.of(name, new Sensor(name, Util.createRandomHost(random), random.nextInt(1024, 65536))));
        }

        int size = sensors.size();

        for (int i = 0; i < size; ++i) {
            Pair<String, Sensor> sensor = sensors.get(i);

            Console.writeLine("%s, %s:%d", sensor.getFirst(), sensor.getSecond().getHost(), sensor.getSecond().getPort());
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}

