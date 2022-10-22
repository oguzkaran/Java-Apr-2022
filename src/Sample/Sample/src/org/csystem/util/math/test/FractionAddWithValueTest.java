package org.csystem.util.math.test;

import org.csystem.util.math.Fraction;
import org.csystem.util.math.test.factory.RandomFractionFactory;

import java.util.Random;
import java.util.Scanner;

public class FractionAddWithValueTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        RandomFractionFactory factory = new RandomFractionFactory(random);

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < count; ++i) {
            System.out.println("---------------------------------------");
            Fraction f = factory.createRandomValidFraction(-10, 11);
            int val = random.nextInt(20);
            Fraction result;

            result = f.add(val);

            System.out.println(f.toString());
            System.out.printf("val = %d%n", val);
            System.out.println(result.toString());
            System.out.println("---------------------------------------");
        }
    }
}
