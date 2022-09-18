package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class GetRandomTextTRENTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {			
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			if (count <= 0)
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(r, count));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(r, count));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}