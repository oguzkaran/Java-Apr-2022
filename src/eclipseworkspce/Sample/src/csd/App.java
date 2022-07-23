/*-----------------------------------------------------------------------------------------------------------------------	
	implicit olarak geçerli olan dönüşümler için de tür dönüştürme operatörü kullanılabilir. Aşağıdaki örnekte bunun
	bir anlamı yoktur	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();		
		long b;
		
		b = (long)a;
		
		System.out.printf("b = %d%n", b);
	}
}

