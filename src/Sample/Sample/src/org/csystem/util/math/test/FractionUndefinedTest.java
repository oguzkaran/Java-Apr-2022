package org.csystem.util.math.test;

import org.csystem.util.math.Fraction;

public class FractionUndefinedTest {
    public static void run()
    {
        Fraction f = new Fraction(25, 15);

        System.out.println(f.toString());

        f.setDenominator(0);
        System.out.println(f.toString());
    }
}
