package org.csystem.util.array.test;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

public class DrawHistogramTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Bir sayı giriniz:");
            int count = kb.nextInt();

            if (count <= 0)
                break;

            int[] a = getRandomArray(r, count, 0, 11);
            print(a);
            int [] data = getHistogramData(a, 10);
            print(data);
            drawHistogram(data, 7, 'X');
        }

        System.out.println("Tekrar yapıyor musunuz=?");
    }
}
