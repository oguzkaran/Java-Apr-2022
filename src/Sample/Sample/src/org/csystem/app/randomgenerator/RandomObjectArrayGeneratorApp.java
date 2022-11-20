package org.csystem.app.randomgenerator;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.Time;
import org.csystem.util.generator.random.RandomObjectArrayGenerator;
import org.csystem.util.wrapper.IntValue;

import java.util.Random;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    private static void doWork(Object [] objects)
    {
        for (Object object : objects) {
            System.out.println("---------------------------------------------------------");
            String typeName = object.getClass().getName();
            System.out.printf("Dinamik tür ismi:%s%n", typeName);

            if (object instanceof String s)
                System.out.println(s.toUpperCase());
            else if (object instanceof Date date)
                System.out.println(date.toLongDateStringTR());
            else if (object instanceof Time time)
                System.out.println(time.toLongTimeString());
            else if (object instanceof int[] a)
                ArrayUtil.print(2, a);
            else if (object instanceof IntValue value) {
                int val = value.getValue();

                System.out.println(val * val);
            }
            System.out.println("---------------------------------------------------------");
        }
    }

    public static void run()
    {
        Random r = new Random();
        RandomObjectArrayGenerator generator = new RandomObjectArrayGenerator(r);
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        doWork(generator.getObjects(count));
    }
}
