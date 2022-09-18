package org.csystem.util.array.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class GetHistogramDataTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            System.out.println("----------------------------------------------------------------");
            int [] a = getRandomArray(r, count, 0, 11);
            print(a);
            int [] data = getHistogramData(a, 10);
            print(data);
            System.out.println("----------------------------------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
