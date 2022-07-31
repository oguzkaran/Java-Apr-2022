/*-----------------------------------------------------------------------------------------------------------------------	
	Homework-003-8. sorunun bir çözümü
	(Not: Çözümde koşul operatörü kullanılmıştır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		PrintCollatzTest.run();
	}
}

class PrintCollatzTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			if (a == 0)
				break;
			
			NumberUtil.printCollatz(a);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class NumberUtil {
	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		System.out.println(n);
		
		while (n != 1) 
			System.out.println(n = (n % 2 == 0) ? (n / 2) : (3 * n + 1));
	}
}

