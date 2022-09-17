package org.csystem.util.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

public class MinMaxIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Birinci sayıyı giriniz:");
		int min = Integer.parseInt(kb.nextLine());
		System.out.print("İkinci sayıyı giriniz:");
		int bound = Integer.parseInt(kb.nextLine());

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			int [] a = getRandomArray(r, count, min, bound);

			print(a);
			System.out.printf("En büyük eleman:%d%n", max(a));
			System.out.printf("En küçük eleman:%d%n", min(a));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}