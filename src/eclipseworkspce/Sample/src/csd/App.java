/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamakları toplamını döndüren sumDigits isimli metodu
	NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot nagatif sayılar için basamakları 
	toplamını pozitif olarak döndürecektir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		SumDigitsTest.run();
	}
}

class SumDigitsTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a;
		System.out.print("Bir sayı giriniz:");
		
		while ((a = Integer.parseInt(kb.nextLine())) != 0) {
			System.out.printf("%d sayısının basamakları toplamı:%d%n", a, NumberUtil.sumDigits(a));			
			System.out.print("Bir sayı giriniz:");
		}		
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class NumberUtil {
	public static int sumDigits(int a)
	{
		int sum = 0;
		
		while (a != 0) {
			sum += a % 10;
			a /= 10;			
		}
		
		return Math.abs(sum);
	}
}
