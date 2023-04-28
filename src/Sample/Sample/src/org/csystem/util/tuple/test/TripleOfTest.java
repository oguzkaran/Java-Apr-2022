package org.csystem.util.tuple.test;

import org.csystem.util.console.Console;
import org.csystem.util.tuple.Triple;

import java.util.ArrayList;
import java.util.Random;

public class TripleOfTest {
    public static void run()
    {
        ArrayList<Triple<Double, Double, Double>> points = new ArrayList<>();
        Random random = new Random();
        int count = Console.readInt("Bir sayı giriniz:");

        while (count-- > 0)
            points.add(Triple.of(random.nextDouble(-100, 100), random.nextDouble(-100, 100), random.nextDouble(-100, 100)));


        for (Triple<Double, Double, Double> point : points)
            Console.writeLine(point);
    }

    public static void main(String[] args)
    {
        run();
    }
}
