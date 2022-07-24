/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan int türden sayıların ortalamasını buşlan progamı yazınız:
	Açıklama: Toplam değeri ve toplam giilen değerlerin sayısı int olarak tutulacaktır
	
	Aşağıdaki örnekte tür dönüştürme operatörü kullanılmazsa bilgi kaybı oluşabilir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		FindAverageApp.run();
	}
}

class FindAverageApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		int sum = 0, count = 0;
		
		for (int a = 0; (a = kb.nextInt()) != 0; ++count, sum += a)
			;
		
		double average = (double)sum / count;
		
		System.out.printf("Ortalama:%f%n", average);
	}
}
