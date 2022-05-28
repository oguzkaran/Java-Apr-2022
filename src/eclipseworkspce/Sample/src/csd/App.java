/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden girilen iki tane int türden sayının toplamını, çarpımını ve farkını aşağıdaki gibi
	ekrana basan programı yazınız:
	Girilen sayılar 10 ve 20 ise
		10 + 20 = 30
		10 * 20 = 200
		10 - 20 = -10
	şeklinde ekran çıktısı olacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		FindSumMultiplySubtractApp.run();		
	}
}

class FindSumMultiplySubtractApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d + %d = %d%n", a, b, NumberUtil.sum(a, b));
		System.out.printf("%d * %d = %d%n", a, b, NumberUtil.multiply(a, b));
		System.out.printf("%d - %d = %d%n", a, b, NumberUtil.subtract(a, b));
	}
}


class NumberUtil {
	public static int sum(int a, int b)
	{
		return a + b;
	}
	
	public static int multiply(int a, int b)
	{
		return a * b;
	}
	
	public static int subtract(int a, int b)
	{
		return a - b;
	}
}