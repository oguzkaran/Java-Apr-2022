/*-----------------------------------------------------------------------------------------------------------------------
    Aşağıddaki örnekte ArrayLiğst'in Integer ve String açılımları kullanılmıştır. Integer açılımında eleman eklenirkenü
    "boxing", eleman alınırken de "unboxing" yapıldığına dikkat ediniz. String açılımı için böyle bir yoktur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        ArrayList<String> texts = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; ++i) {
            texts.add(StringUtil.getRandomTextTR(random, random.nextInt(4, 7)));
            numbers.add(random.nextInt(100));
        }

        for (String text : texts)
            System.out.println(text);

        System.out.println("-------------------------------------------------------------------");

        for (int val : numbers)
            System.out.printf("%d ", val);

        System.out.println();
    }
}


