/*----------------------------------------------------------------------------------------------------------------------
	void metotlar geri dönüş değeri varmış gibi çağrılamaz. Yani void metot çağrısı geri dönüş değeri varmış gibi 
	işleme sokulamaz
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		int result;
		
		result = Util.printSum(); //error
	}
}


class Util {
	public static void printSum()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());		
		int result;
		
		result = a + b;	
		
	
		System.out.println(result);
	}
}