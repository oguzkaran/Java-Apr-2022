package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.IntValue;

public class IntValueOfTest {
    public static void run()
    {
        IntValue iVal1 = IntValue.of(100);
        IntValue iVal2 = IntValue.of(100);
        IntValue iVal3 = IntValue.of(128);
        IntValue iVal4 = IntValue.of(128);

        System.out.println(iVal1 == iVal2 ? "Aynı nesne" : "Farklı nesneler");
        System.out.println(iVal3 == iVal4 ? "Aynı nesne" : "Farklı nesneler");

        System.out.printf("Value1:%d%n", iVal1.getValue());
        System.out.printf("Value2:%d%n", iVal2.getValue());
        System.out.printf("Value3:%d%n", iVal3.getValue());
        System.out.printf("Value4:%d%n", iVal4.getValue());
        System.out.println("Tekrar yapıyor musunuz?");
    }
}
