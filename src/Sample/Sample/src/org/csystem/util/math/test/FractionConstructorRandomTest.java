package org.csystem.util.math.test;

import org.csystem.util.math.Fraction;
import org.csystem.util.math.test.factory.RandomFractionFactory;

import java.util.Scanner;

public class FractionConstructorRandomTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        RandomFractionFactory factory = new RandomFractionFactory();

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());


        for (int i = 0; i < count; ++i) {
            System.out.println("---------------------------------------");
            Fraction f = factory.createRandomFraction(-10, 11);

            System.out.println(f.toString());
            System.out.println("---------------------------------------");
        }
    }
}
