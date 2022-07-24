/*-----------------------------------------------------------------------------------------------------------------------	
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());		
		
		int max = a > b ? a : b;		
		
		System.out.printf("max(%d, %d) = %d%n", a, b, max);		
	}
}

