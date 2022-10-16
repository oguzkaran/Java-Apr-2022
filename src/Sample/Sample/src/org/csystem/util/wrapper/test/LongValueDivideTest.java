package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.LongValue;

import java.util.Scanner;

public class LongValueDivideTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Böleni giriniz:");
            LongValue divider = LongValue.of(Long.parseLong(kb.nextLine()));

            if (divider.compareTo(LongValue.ZERO) == 0)
                break;

            System.out.print("Bölüneni giriniz:");
            LongValue dividend =  LongValue.of(Long.parseLong(kb.nextLine()));

            LongValue [] result = dividend.divideAndRemainder(divider);

            System.out.printf("Bölüm:%d%n", result[0].getValue());
            System.out.printf("Kalan:%d%n", result[1].getValue());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
