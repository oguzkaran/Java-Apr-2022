/*-----------------------------------------------------------------------------------------------------------------------	
	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int a;
		int sum = 0;
		
		while ((a = kb.nextInt()) != 0)
			sum += a;
		
		System.out.printf("Toplam:%d%n", sum);				
	}
}

