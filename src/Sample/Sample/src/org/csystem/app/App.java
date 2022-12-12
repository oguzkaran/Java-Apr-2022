/*-----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının ensureCapacity metodu capacity değerini aşağıdaki şekilde belirler (else if biçiminde
    değerlendiriniz):
    - Yeni capacity değeri var olan capacity değerinden küçük veya eşit ise değişiklik yapmaz

    - Yeni capacity değeri var olan capacity değerinin artması gereken miktardan küçük veya eşitse artması gereken değere
    çeker

    - Yeni capacity değeri var olan capacity değerinin artması değerinden büyük verilen capacity değerine çeker
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class App {
    public static void main(String[] args)
    {
        Random r = new Random();
        Vector passwords = new Vector();

        for (int i = 0; i < 12; ++i)
            passwords.add(StringUtil.getRandomTextTR(r, r.nextInt(5, 11)));

        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("-------------------------------------------------");


        passwords.ensureCapacity(17);
        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("-------------------------------------------------");

        passwords.ensureCapacity(37);
        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("-------------------------------------------------");

        passwords.ensureCapacity(90);
        System.out.printf("Capacity:%d%n", passwords.capacity());
        System.out.printf("Size:%d%n", passwords.size());
        System.out.println("-------------------------------------------------");
    }
}

