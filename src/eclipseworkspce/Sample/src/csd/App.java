/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda tamsayı türlerinin (short, int, long, byte) hexadecimal olarak formatlanması için x, X, h, H 
	format karakteri kullanılır. Ayrıca o (küçük O harfi) format karakteri ile tamsayı türleri octal olarak formatlanabilir 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.printf("a = %d%n", a);
		System.out.printf("a = %x%n", a);
		System.out.printf("a = %X%n", a);
		System.out.printf("a = %h%n", a);
		System.out.printf("a = %H%n", a);
		System.out.printf("a = %o%n", a);
	}
}

