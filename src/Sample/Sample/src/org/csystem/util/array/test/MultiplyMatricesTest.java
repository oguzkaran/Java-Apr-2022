package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class MultiplyMatricesTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			int m = r.nextInt(3, 5);
			int n = r.nextInt(3, 5);
			int k = r.nextInt(3, 5);
			int [][] m1 = ArrayUtil.getRandomMatrix(r, m, n, 0, 99);
			int [][] m2 = ArrayUtil.getRandomMatrix(r, n, k, 0, 99);
			System.out.println("----------------------------------------------------");
			System.out.printf("%d X %d * %d X %d = %d X %d%n", m, n, n, k, m, k);
			ArrayUtil.print(2, m1);
			System.out.println("*");
			ArrayUtil.print(2, m2);
			System.out.println("=");
			ArrayUtil.print(5, ArrayUtil.multiplyMatrices(m1, m2));
			System.out.println("----------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}