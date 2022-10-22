package org.csystem.util.math.test;

import org.csystem.util.math.Fraction;
import org.csystem.util.math.test.factory.RandomFractionFactory;

import java.util.Scanner;

public class FractionAddTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        RandomFractionFactory factory = new RandomFractionFactory();

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < count; ++i) {
            System.out.println("---------------------------------------");
            Fraction f1 = factory.createRandomValidFraction(-10, 11);
            Fraction f2 = factory.createRandomValidFraction(-10, 11);
            Fraction result;

            result = f1.add(f2);

            System.out.println(f1.toString());
            System.out.println(f2.toString());
            System.out.println(result.toString());
            System.out.println("---------------------------------------");
        }
    }
}
