/*-----------------------------------------------------------------------------------------------------------------------	
	-- operatörünün prefix kullanımında ürettiği değer yani işleme giren değer azaltılMAmış değerdir  	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int i;
		for (i = 0; i < 5; ++i)
			System.out.println("Merhaba");
		
		System.out.printf("i = %d%n", i);
	}
}