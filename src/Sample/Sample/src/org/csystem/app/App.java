/*-----------------------------------------------------------------------------------------------------------------------
    Polymorphism (çok biçimlilik): Biyoloji'de çok biçimlilik şu şekilde tanımlanabilir: "Farklı doku ya da organların
    evrim süreci içerisinde temel işlevleri aynı kalmak koşuluyla, bu işlevi yerine getirme biçiminin değişebilmesidir".
    Örneğin görme davranışı birbirfin türemiş veya aynı sınıftan farklı koldan türetilerek gelmiş canlılar arasında farklılık
    gösterebilmektedir. Ancak görev "görmektir".


-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        CSDArrayList numbers = new CSDArrayList();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i)
            numbers.add(i * 10);

        int size = numbers.size();

        for (int i = 0; i < size; ++i) {
            int val = (int)numbers.get(i);

            System.out.printf("%02d ", val);
        }

        System.out.println();

        int oldValue = (int)numbers.set(3, 78);

        size = numbers.size();

        for (int i = 0; i < size; ++i) {
            int val = (int)numbers.get(i);

            System.out.printf("%02d ", val);
        }

        System.out.println();

        System.out.printf("Eski değer:%d%n", oldValue);
    }
}