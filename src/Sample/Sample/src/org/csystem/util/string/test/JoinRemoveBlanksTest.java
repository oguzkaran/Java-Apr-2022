package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class JoinRemoveBlanksTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();
		String [] texts = new String[count];

		while (count-- > 0)
			texts[count] = r.nextBoolean() ? " ".repeat(r.nextInt(10)) : StringUtil.getRandomTextTR(r, r.nextInt(5, 10));

		for (int i = 0; i < texts.length; ++i)
			System.out.printf("%s ", texts[i].isBlank() ? "Blank" : texts[i]);

		System.out.println();
		System.out.println(StringUtil.join(texts, "--", true));

		System.out.println("Tekrar yapıyor musunuz?");
	}
}