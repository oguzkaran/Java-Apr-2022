/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarını ter yüz eden reverse isimli metodu
	başka bir dizi kullanmadan ArrayUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.*;

class App {
	public static void main(String [] args)
	{
		ReverseIntArrayTest.run();
	}
}

class ReverseIntArrayTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		for (;;) {
			System.out.print("Dizinin eleman sayısını giriniz:");
			int count = Integer.parseInt(kb.nextLine());

			if (count <= 0)
				break;

			int [] a = getRandomArray(r, count, 0, 100);

			print(2, a);
			reverse(a);
			print(2, a);
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}


