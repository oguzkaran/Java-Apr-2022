/*-----------------------------------------------------------------------------------------------------------------------
    Dinamik büyüyen dizi (dynamic array) veri yapıları diziyi eklenen eleman sayısı kadar büyütmez. Dizinin büyütülmesi
    gerektiği durumda büyütme işlemini biraz fazlaca yazar. İşte bu tarz veri yapıllarında dizinin gerçek uzunluğuna
    "capacity" değeri denir. Dizide mantıksal olarak tutulan elemanların sayısına "size/count" denir. size hiçbir zaman
    "capacity" değerinden büyü olamaz. "Capacity" değerim "size" değerie eşit veya size değerinden büyük olabilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

class App {
    public static void main(String [] args)
    {
        Random r = new Random();
        int [] a = ArrayUtil.getRandomArray(r, 10, 0, 100);

        ArrayUtil.print(2, a);

        a = ArrayUtil.copyOf(a, a.length * 2);

        ArrayUtil.print(2, a);
    }
}


