/*-----------------------------------------------------------------------------------------------------------------------	
	for döngü deyimi birinci kısmında bildirilen değişken for döngü deyimi boyunca görülebilirdir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();	
		
		for (int i = 0; i < n; ++i)
			System.out.printf("%d ", i);
		
		System.out.println();
		System.out.printf("Döngü sonrası i = %d%n", i); //error
	}
}