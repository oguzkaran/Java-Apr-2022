/*-----------------------------------------------------------------------------------------------------------------------	
	Homework-005-3. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void  main(String [] args)
	{
		AreFriendsTest.run();
	}
}


class AreFriendsTest {
	public static void run()
	{
		AreFriendsInputTest.run();
		AreFriends3DigitsTest.run();
		AreFriends4DigitsTest.run();		
	}
}

class AreFriends4DigitsTest {
	public static void run()
	{
		System.out.println("4 basamaklı arkadaş sayılar:");
		
		for (int a = 1000; a <= 9999; ++a)
			for (int b = a + 1; b <= 9999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
	}
}

class AreFriends3DigitsTest {
	public static void run()
	{
		System.out.println("3 basamaklı arkadaş sayılar:");
		
		for (int a = 100; a <= 999; ++a)
			for (int b = a + 1; b <= 999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
	}
}

class AreFriendsInputTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("İki sayı giriniz:");
			int a = kb.nextInt();
			int b = kb.nextInt();
			
			if (a == 0)
				break;
			
			if (NumberUtil.areFriends(a, b))
				System.out.printf("%d ve %d sayıları arkadaştır%n", a, b);
			else
				System.out.printf("%d ve %d sayıları arkadaş değildir%n", a, b);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static boolean areFriends(int a, int b)
	{
		return sumFactors(a) == b && sumFactors(b) == a;
	}
	
	public static int sumFactors(int a)
	{
		int result = 1;
		int sqrtVal = (int)Math.sqrt(a);
		
		for (int i = 2; i <= sqrtVal; ++i)
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);
		
		return result;		
	}
}
