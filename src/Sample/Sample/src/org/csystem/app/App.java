/*-----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte run metodu NaNException fırlatıldığında onu yakalamış ve aynı nesneyi yeniden fırlatmıştır. Bu işleme
    "rethrow" denir. Örnekte run metodu müşteri kodlar açısından NaNExcption da fırlatabilir durumdadır. Bu run metodunun
    dökumanlarına yazılır. run metodunu yazan programcı açısından ise NanException ham ilgili try bloğunda işlenmiş (handling).
    hem de aynı exceptiıon nesnesi müşteri koda fırlatılmış olur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        try {
            Application.run();
            //...
        }
        catch (InfinityException ignore) {
            System.out.println("Undefined");
        }
        catch (NaNException ignore) {
            System.out.println("main:Indeterminate");
        }
        catch (InputMismatchException ignore) {
            System.out.println("Input mismatch");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class Application {
    public static void run()
    {
        try {
            Scanner kb = new Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            double val = kb.nextDouble();

            System.out.printf("log(%.2f) = %f%n", val, MathUtil.log(val));
        }
        catch (NaNException ex) {
            System.out.println("Indeterminate");
            throw ex; //rethrow
        }

        System.out.println("run sonu!...");
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


class InfinityException extends MathException {

}

class NaNException extends MathException {

}


class MathException extends RuntimeException {

}

