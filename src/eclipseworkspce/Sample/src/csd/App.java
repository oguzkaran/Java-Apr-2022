/*-----------------------------------------------------------------------------------------------------------------------	
	Nesnenin yaratılması adımları:
	1. Bellekte yer ayırılır
	2. non-static olan (ancak final olmayan) veri elemanlarına default değerler atanır
	3. Constructor (ctor) çağrılır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Random random = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		long seed = Long.parseLong(kb.nextLine());		
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%02d ", random.nextInt(100));
		
		System.out.println();
		
		random.setSeed(seed);
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%02d ", random.nextInt(100));
		
		System.out.println();		
	}
}
