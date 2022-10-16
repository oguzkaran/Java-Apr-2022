package org.csystem.util.wrapper.test;

import org.csystem.util.wrapper.LongValue;

public class LongValueOperationsTest {
    public static void run()
    {
        for (LongValue val = LongValue.ZERO; val.compareTo(LongValue.TEN) < 0; val = val.add(LongValue.TWO))
            System.out.printf("%02d ", val.getValue());

        System.out.println();

        for (LongValue val = LongValue.ZERO; val.compareTo(LongValue.TEN) < 0; val = val.inc())
            System.out.printf("%02d ", val.getValue());

        System.out.println();

        for (LongValue val = LongValue.TEN; val.compareTo(LongValue.ZERO) >= 0; val = val.dec())
            System.out.printf("%02d ", val.getValue());

        System.out.println();

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
