package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.LongValue;

public class LongValueOfTest {
    public static void run()
    {
        LongValue val1 = LongValue.of(100);
        LongValue val2 = LongValue.of(100);
        LongValue val3 = LongValue.of(5_000_000_000L);
        LongValue val4 = LongValue.of(5_000_000_000L);

        System.out.println(val1 == val2 ? "Aynı nesne" : "Farklı nesneler");
        System.out.println(val3 == val4 ? "Aynı nesne" : "Farklı nesneler");

        System.out.printf("Value1:%d%n", val1.getValue());
        System.out.printf("Value2:%d%n", val2.getValue());
        System.out.printf("Value3:%d%n", val3.getValue());
        System.out.printf("Value4:%d%n", val4.getValue());
        System.out.println("Tekrar yapıyor musunuz?");
    }
}
