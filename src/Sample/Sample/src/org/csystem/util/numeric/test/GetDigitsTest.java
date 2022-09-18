package org.csystem.util.numeric.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.numeric.NumberUtil.getDigits;

public class GetDigitsTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		while (count-- > 0) {
			long a = r.nextLong();
			System.out.printf("a = %d%n", a);
			print(getDigits(a));
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}