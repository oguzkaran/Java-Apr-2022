/*-----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği çeşitli değerler ile çalıştırıp sonucları gözlemleyiniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Scanner kb = new Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            double val = kb.nextDouble();

            System.out.printf("log(%.2f) = %f%n", val, MathUtil.log(val));
        }
        catch (InfinityException ignore) {
            System.out.println("Undefined");
        }
        catch (NaNException ignore) {
            System.out.println("Indeterminate");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class MathUtil {
    public static double log(double a)
    {
        if (a == 0)
            throw new InfinityException();

        if (a < 0)
            throw new NaNException();

        return Math.log(a);

    }
}

class InfinityException extends RuntimeException {

}

class NaNException extends RuntimeException {

}
