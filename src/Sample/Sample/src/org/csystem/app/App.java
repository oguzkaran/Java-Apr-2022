/*-----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.MutableIntValue;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = kb.nextInt();

        if (val < 1 || val > 3) {
            System.out.println("Geçersiz değer!...");
            System.exit(1);
        }

        MutableIntValue mutableIntValue = null;

        switch (val) {
            case 1 -> mutableIntValue = new MutableIntValue(-128);
            case 2 -> mutableIntValue = new MutableIntValue(0);
            case 3 -> mutableIntValue = new MutableIntValue(127);
        }

        System.out.printf("Value:%d%n", mutableIntValue.getValue());
    }
}

class Sample {
    public int x;

    //...
}