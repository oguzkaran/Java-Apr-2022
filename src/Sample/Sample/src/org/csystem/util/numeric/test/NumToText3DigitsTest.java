package org.csystem.util.numeric.test;

import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

public class NumToText3DigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            int val = r.nextInt(-999, 1000);
            String fmt = (val < 0 ? "-%03d " : " %03d ") + " -> %s%n";

            System.out.printf(fmt, Math.abs(val), NumberUtil.numToText3DigitsTR(val));
        }
    }
}
