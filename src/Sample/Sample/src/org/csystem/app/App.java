/*-----------------------------------------------------------------------------------------------------------------------
    ArrayList sınıfı for-each döngü deyimi ile dolaşılabilir (iterable) bir sınıftır. for-each döngü deyiminin her adımında
    içeride tutulan elemanlar sırasıyla elde edilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.ArrayList;

class App {
    public static void main(String[] args)
    {
        ArrayList numbers = new ArrayList();

        for (int i = 0; i < 21; ++i)
            numbers.add(i * 10);

        for (Object o : numbers) {
            int val = (int) o;

            System.out.printf("%d ", val);
        }

        System.out.println();
    }
}


