package org.csystem.util.math.geometry.test;

import org.csystem.util.math.geometry.Circle;

import java.util.Scanner;

public class CircleToStringTest {
    private static void printCircle(Circle c)
    {
        System.out.println(c.toString());
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
