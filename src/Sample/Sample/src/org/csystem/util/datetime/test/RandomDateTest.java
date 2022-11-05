package org.csystem.util.datetime.test;

import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.DateUtil;

import java.util.Random;
import java.util.Scanner;

public class RandomDateTest {
    private static void printRandomDate(Random r)
    {
        Date date = DateUtil.randomDate(r, 1900, 2100);
        System.out.println(date.toLongDateStringEN());
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        while (count-- > 0)
            printRandomDate(r);

        System.out.println("Tekrar yapıyor musunuz?");

    }
}
