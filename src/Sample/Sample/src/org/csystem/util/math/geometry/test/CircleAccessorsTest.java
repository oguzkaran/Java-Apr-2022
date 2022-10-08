package org.csystem.util.math.geometry.test;

import org.csystem.util.math.geometry.Circle;

import java.util.Scanner;

public class CircleAccessorsTest {
    private static void printCircle(Circle c)
    {
        System.out.printf("Radius:%f%n", c.getRadius());
        System.out.printf("Area:%f%n", c.getArea());
        System.out.printf("Circumference:%f%n", c.getCircumference());

    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        Circle c = new Circle();

        printCircle(c);

        for (;;) {
            System.out.print("Yarıçapı giriniz:");
            double radius = Double.parseDouble(kb.nextLine());

            if (radius == 0)
                break;

            c.setRadius(radius);
            printCircle(c);
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
