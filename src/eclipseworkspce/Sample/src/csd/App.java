/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden denklemin köklerini bulup ekrana yazdıran 
	programı yazınız.
	Açıklamalar:
	- İki kök varsa örneğin 
		x1 = 3, x2 = 4 
	biçiminde ekrana yazılacaktır
	- Çakışık kök varsa 
		x1 = x2 = -4 
	biçiminde ekrana yazılacaktır
	- Gerçek kök yoksa 
		Gerçek kök yok!... 
	biçiminde ekrana yazılacaktır 
	
	- İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int a = kb.nextInt();
		
		if (a > 6)
			System.out.println("a > 6");
		if (a > 11)
			System.out.println("a > 11");
		if (a > 21)
			System.out.println("a > 21");
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

