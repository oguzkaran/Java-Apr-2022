/*----------------------------------------------------------------------------------------------------------------------
	return deyimi nasıl kullanılırsa kullanılsın metodu sonlandırır. Aşağıdaki örnekte return deyiminde sonra akış
	metot içerisinde kalmayacağından error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		int a;
		
		a = Util.sum() * 2;
		
		System.out.println(a);				
	}
}

class Util {
	public static int sum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());
		
		int result;
		
		result = a + b;
		
		return result;
		
		System.out.println("Unreachable code"); //error
	}
}