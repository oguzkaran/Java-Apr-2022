package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

public class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.nextLine();
			
			if ("elma".equals(str))
				break;
			
			System.out.printf("Yazının tersi:(%s)%n", StringUtil.reverse(str));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}