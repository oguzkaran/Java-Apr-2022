/*-----------------------------------------------------------------------------------------------------------------------	
	Homework-002-5. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		BallFallApp.run();
	}
}

class BallFallApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Input width and height:");
			int width = kb.nextInt();
			int height = kb.nextInt();
			
			if (width == 0)
				break;
			
			BallFall.play(width, height);			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}

class NumberUtil {
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
	}
}
