/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın aşağıdaki 
	açıklamalara göre haftanın hangi gününe geldiği bilgisini döndüren getDayOfWeek metodunu yazınız ve aşağıdaki
	uygulamayı çalıştırınız
	
	Açıklamalar:
		- Metot geçersiz bir tarih için -1 değerine geri dönecektir
		
		- Haftanın günü 1.1.1900 ile verilen tarih arasındaki (verilen tarih dahil) toplam gün sayısının 7 ile bölümünden
		elde edilen kalan ile belirlenebilir. Buna göre değer sıfır ise "pazar, 1 ise "pazartesi", ..., 6 ise "cumartesi" 
		günlerine karşılık gelir
		
		- 1.1.1900 öncesindeki tarihler geçersiz sayılacaktır
		
		- getDayOfWeek ile birlikte parametresi ile aldığı int türden gün, ay ve yıl bilgisiine ilişkin tarihin 
		hafta sonu olup olmadığını test eden isWeekend ve hafta içi olup olmadığını test eden isWeekDay metotlarını
		yazınız. Bu iki metot tarih geçerlilik kontrolü yapmayacaktır
		
			
	Not: İleride daha iyisi yazılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.datetime;

public class DateApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Gün ay ve yıl bilgilerini giriniz:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0)
				break;
			
			DateUtil.printDateTR(day, month, year);
			DateUtil.printDateEN(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}
