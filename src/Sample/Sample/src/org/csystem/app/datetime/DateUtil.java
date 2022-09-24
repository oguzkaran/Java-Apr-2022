package org.csystem.app.datetime;

public class DateUtil {
	public static int [] daysOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static String [] monthsTR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
			"Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

	public static String [] monthsEN = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public static String [] dayOfWeeksTR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

	public static String [] dayOfWeeksEN = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

	public static void printDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		if (dayOfWeek == -1) {
			System.out.println("Geçersiz tarih");
			return;
		}

		System.out.printf("%d %s %d %s%n", day, monthsTR[month], year, dayOfWeeksTR[dayOfWeek]);
		
		System.out.println(isWeekend(day, month, year) ? "Bugün kurs var. Tekrar yapınız mı?" : "Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız!...");				
	}

	public static void printDateEN(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);

		if (dayOfWeek == -1) {
			System.out.println("Invalid date");
			return;
		}

		System.out.printf("%d%s %s %d %s%n", day, getDaySuffix(day), monthsEN[month], year, dayOfWeeksEN[dayOfWeek]);

		System.out.println(isWeekend(day, month, year) ? "That is the course day. Did you review?" : "Course day is coming. Donot forget to review!...");
	}


	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;
		
		if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1)
			return -1;
		
		for (int y = 1900; y < year; ++y)
			totalDays += isLeapYear(y) ? 366 : 365;			
		
		return totalDays % 7;			
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);
		
		return dayOfWeek == 0 || dayOfWeek == 6;		
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		return !isWeekday(day, month, year);
	}

	public static String getDaySuffix(int day)
	{
		return switch (day) {
			case 1, 21, 31 -> "st";
			case 2, 22 -> "nd";
			case 3, 23 -> "rd";
			default -> "th";
		};
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return -1;
		
		int totalDays = day;

		for (int i = month - 1; i >= 1; --i)
			totalDays += daysOfMonths[i];

		return month > 2 && isLeapYear(year) ? totalDays + 1 : totalDays;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
	}
	
	public static int getDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : daysOfMonths[month];
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}
