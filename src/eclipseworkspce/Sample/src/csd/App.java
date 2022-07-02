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
package csd;

class App {
	public static void main(String [] args)
	{	
		DateApp.run();
	}
}

class DateApp {
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
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}

class DateUtil {	
	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}
		
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		default:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		}
		
		if (isWeekend(dayOfWeek, month, year))
			System.out.println("Bugün kurs var. Tekrar yapınız mı?");
		else
			System.out.println("Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...");		
	}	
	
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		//TODO:
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		//TODO:
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		//TODO:
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;
		
		switch (month - 1) {
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;
		}
		
		return totalDays;
		
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		int days;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;
			break;
		default:
			days = 31;
		}
		
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

