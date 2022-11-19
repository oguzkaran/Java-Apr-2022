package org.csystem.util.datetime.test;

import org.csystem.util.datetime.Time;
import org.csystem.util.datetime.TimeUtil;

import java.util.Random;
import java.util.Scanner;

public class RandomTimeTest {
    private static void printRandomTime(Random r)
    {
        Time time = TimeUtil.randomTime(r);
        System.out.println(time.toLongTimeString());
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        while (count-- > 0)
            printRandomTime(r);

        System.out.println("Tekrar yapıyor musunuz?");

    }
}
