package org.csystem.util.math.test;

import org.csystem.util.console.Console;
import org.csystem.util.math.Fraction;
import org.csystem.util.math.MathException;

public class FractionUndefinedTest {
    public static void run()
    {
        try {
            Fraction f = new Fraction(25, 15);

            System.out.println(f.toString());

            f.setDenominator(0);
            System.out.println(f.toString());
        }
        catch (MathException ex) {
            Console.writeLine(ex.getMessage());
        }
    }
}
