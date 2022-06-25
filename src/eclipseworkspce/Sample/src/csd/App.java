/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayıdan büyük ilk asal sayıyı döndüren getNextPrime isimli 
	metodu yazınız ve aşağıdaki kod ile test ediniz
	Açıklamalar:
		- isPrime metodunun hızlı versiyonunun, "hızlı" olduğu bilinciyle getPrime metodunu yazınız				
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetNextPrimeTest.run();
	}
}

class GetNextPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
			
			System.out.printf("%d. asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}
		
	}
}

class NumberUtil {
	public static long getNextPrime(int n)
	{		
		//TODO:
	}
	
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

