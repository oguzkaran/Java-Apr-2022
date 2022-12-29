/*-----------------------------------------------------------------------------------------------------------------------
    abstract sınıflar ve abstract metotlar:

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;
import org.csystem.util.datetime.DateUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        CSDArrayList list = new CSDArrayList();

        System.out.println(list);

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i)
            list.add(i * 10);

        System.out.println(list);

        for (int i = 0; i < count; ++i)
            list.add(DateUtil.randomDate(r));

        System.out.println(list);
    }
}
