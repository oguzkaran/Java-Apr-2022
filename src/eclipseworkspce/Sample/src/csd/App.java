/*-----------------------------------------------------------------------------------------------------------------------	
	Java 17 öncesinde [a, b] aralığında rasgele int türden sayı üretimi
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Random random = new java.util.Random();
		int a = 10;
		int b = 21;
		
		for (int i = 0; i < 20; ++i)
			System.out.printf("%d ", random.nextInt(b - a + 1) + a); //[a, b] 
		
		System.out.println();
	}
}


