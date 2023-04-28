package org.csystem.util.tuple.test;

import org.csystem.util.console.Console;
import org.csystem.util.tuple.Triple;

import java.util.ArrayList;
import java.util.Random;

public class TripleConstructorTest {
    public static void run()
    {
        ArrayList<Triple<Double, Double, Double>> points = new ArrayList<>();
        Random random = new Random();
        int count = Console.readInt("Bir sayı giriniz:");

        while (count-- > 0)
            points.add(new Triple<>(random.nextDouble(-100, 100), random.nextDouble(-100, 100), random.nextDouble(-100, 100)));


        for (Triple<Double, Double, Double> point : points)
            Console.writeLine("%s, %s, %s", point.getFirst(), point.getSecond(), point.getThird());
    }

    public static void main(String[] args)
    {
        run();
    }
}
