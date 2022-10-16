package org.csystem.util.math.geometry.test;

import org.csystem.util.math.geometry.MutablePoint;
import org.csystem.util.math.geometry.Point;
import org.csystem.util.math.geometry.test.factory.RandomPointFactory;

import java.util.Scanner;

public class PointTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        RandomPointFactory factory = new RandomPointFactory();

        while (count-- > 0) {
            System.out.println("------------------------------------------");
            Point p = factory.createRandomPoint(-200, 200);
            System.out.printf("Point:%s%n", p.toString());
            MutablePoint mp = p.toMutablePoint();
            System.out.printf("Converted MutablePoint:%s%n", mp.toString());
            p = mp.toPoint();
            System.out.printf("Converted Point:%s%n", p.toString());
            System.out.println("------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
