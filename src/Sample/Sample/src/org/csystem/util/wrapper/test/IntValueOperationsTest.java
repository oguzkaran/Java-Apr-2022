package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.IntValue;

public class IntValueOperationsTest {
    public static void run()
    {
        for (IntValue iVal = IntValue.ZERO; iVal.compareTo(IntValue.TEN) < 0; iVal = iVal.add(IntValue.TWO))
            System.out.printf("%02d ", iVal.getValue());

        System.out.println();

        for (IntValue iVal = IntValue.ZERO; iVal.compareTo(IntValue.TEN) < 0; iVal = iVal.inc())
            System.out.printf("%02d ", iVal.getValue());

        System.out.println();

        for (IntValue iVal = IntValue.TEN; iVal.compareTo(IntValue.ZERO) >= 0; iVal = iVal.dec())
            System.out.printf("%02d ", iVal.getValue());

        System.out.println();

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
