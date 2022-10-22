package org.csystem.util.math.test;

import org.csystem.util.math.Fraction;
import org.csystem.util.math.test.factory.RandomFractionFactory;

import java.util.Scanner;

public class FractionCompareToTest {
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

            System.out.println(f1.toString());
            System.out.println(f2.toString());

            int result;

            if ((result = f1.compareTo(f2)) < 0)
                System.out.printf("%d / %d < %d / %d%n", f1.getNumerator(), f1.getDenominator(), f2.getNumerator(), f2.getDenominator());
            else if (result > 0)
                System.out.printf("%d / %d > %d / %d%n", f1.getNumerator(), f1.getDenominator(), f2.getNumerator(), f2.getDenominator());
            else
                System.out.printf("%d / %d = %d / %d%n", f1.getNumerator(), f1.getDenominator(), f2.getNumerator(), f2.getDenominator());

            System.out.println("---------------------------------------");
        }
    }
}
