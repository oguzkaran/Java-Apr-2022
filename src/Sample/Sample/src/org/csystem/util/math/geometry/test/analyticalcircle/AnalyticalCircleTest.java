package org.csystem.util.math.geometry.test.analyticalcircle;

import org.csystem.util.math.geometry.AnalyticalCircle;
import org.csystem.util.math.geometry.test.factory.RandomAnalyticalCircleFactory;

import java.util.Random;
import java.util.Scanner;

public class AnalyticalCircleTest {
    public static void run()
    {
        RandomAnalyticalCircleFactory factory = new RandomAnalyticalCircleFactory(new Random());
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            AnalyticalCircle ac = factory.createAnalyticalCircle(-100, 100);

            System.out.println(ac.toString());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
