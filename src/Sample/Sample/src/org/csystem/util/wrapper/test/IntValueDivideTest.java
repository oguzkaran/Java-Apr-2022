package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.IntValue;

import java.util.Scanner;

public class IntValueDivideTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Böleni giriniz:");
            IntValue divider = IntValue.of(Integer.parseInt(kb.nextLine()));

            if (divider.compareTo(IntValue.ZERO) == 0)
                break;

            System.out.print("Bölüneni giriniz:");
            IntValue dividend =  IntValue.of(Integer.parseInt(kb.nextLine()));

            IntValue [] result = dividend.divideAndRemainder(divider);

            System.out.printf("Bölüm:%d%n", result[0].getValue());
            System.out.printf("Kalan:%d%n", result[1].getValue());
        }
        System.out.println("Tekrar yapıyor musunuz?");
    }
}
