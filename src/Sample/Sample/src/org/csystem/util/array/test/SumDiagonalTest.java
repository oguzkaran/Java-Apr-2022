package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class SumDiagonalTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		for (int i = 0; i < count; ++i) {
			int [][] a = ArrayUtil.getRandomSquareMatrix(r, r.nextInt(3, 8), 0, 100);
			System.out.println("----------------------------------------------------");
			ArrayUtil.print(2, a);
			System.out.printf("Esas köşegen üzerisndeki elemanların toplamı:%d%n", ArrayUtil.sumDiagonal(a));
			System.out.println("----------------------------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}