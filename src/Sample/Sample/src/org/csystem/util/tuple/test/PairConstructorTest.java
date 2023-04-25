package org.csystem.util.tuple.test;

import org.csystem.util.console.Console;
import org.csystem.util.string.StringUtil;
import org.csystem.util.tuple.Pair;

import java.util.ArrayList;
import java.util.Random;

public class PairConstructorTest {
    public static void run()
    {
        ArrayList<Pair<String, Sensor>> sensors = new ArrayList<>();
        Random random = new Random();
        int count = Console.readInt("Bir sayı giriniz:");

        while (count-- > 0) {
            String name = StringUtil.getRandomTextTR(random, random.nextInt(5, 16));
            sensors.add(new Pair<>(name, new Sensor(name, Util.createRandomHost(random), random.nextInt(1024, 65536))));
        }

        for (Pair<String, Sensor> sensor : sensors)
            Console.writeLine("%s, %s:%d", sensor.getFirst(), sensor.getSecond().getHost(), sensor.getSecond().getPort());
    }

    public static void main(String[] args)
    {
        run();
    }
}
