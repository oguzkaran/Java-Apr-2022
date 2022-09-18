/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağdaki açıklamalara göre getHistogramData isimli metodu ArrayUtil sınıfı içerisinden yazınız ve
	aşağıdaki kod ile test ediniz:
	Açıklamalar:
		- Metot int türden bir dizi ve int türden bir n sayısı alacaktır
			int [] getHistogramData(int [] a, int n)
		- Metot a dizisi içerisinde [0, n] arasındaki sayılardan hangisinin kaç tane olduğunu içeren bir sayaç dizisine
		geri dönecektir.

		- Sayaç dizisinin her bir indeks numarası [0, n] aralığındaki sayıyı temsil edecektir. Yani örneğin 3 numaralı
		indeksteki değer 3 sayısının kaç tane olduğu bilgisini içerecektir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		FirstNotRepeatingCharacterTest.run();
	}
}

class FirstNotRepeatingCharacterTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		FirstNotRepeatingCharacterRandomTest.run(kb);
		FirstNotRepeatingCharacterInputTest.run(kb);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class FirstNotRepeatingCharacterRandomTest {
	public static void run(Scanner kb)
	{
		Random r = new Random();
		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());

		while (count-- > 0) {
			System.out.println("---------------------------------------");
			String s = StringUtil.getRandomTextEN(r, r.nextInt(10, 21)).toLowerCase();

			System.out.println(s);
			char ch = Util.firstNotRepeatingCharacter(s);
			System.out.printf("%s%n", ch == '_' ? "Tüm karakterler tekrarlıyor" : "İlk tekrarlanmayan karakter:" + ch);
			System.out.println("---------------------------------------");
		}
	}
}

class FirstNotRepeatingCharacterInputTest {
	public static void run(Scanner kb)
	{
		System.out.print("Bir sayı giriniz:");
		int count = Integer.parseInt(kb.nextLine());

		for (int i = 0; i < count; ++i) {
			System.out.println("---------------------------------------");
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			char ch = Util.firstNotRepeatingCharacter(s);
			System.out.printf("%s%n", ch == '_' ? "Tüm karakterler tekrarlıyor" : "İlk tekrarlanmayan karakter:" + ch);
			System.out.println("---------------------------------------");
 		}
	}
}

class Util {
	public static char firstNotRepeatingCharacter(String s)
	{
		int [] counts = new int[26];
		int len = s.length();

		for (int i = 0; i < len; ++i)
			++counts[s.charAt(i) - 'a'];

		for (int i = 0; i < len; ++i) {
			char ch = s.charAt(i);

			if (counts[ch - 'a'] == 1)
				return ch;
		}

		return '_';
	}
}