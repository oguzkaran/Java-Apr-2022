/*-----------------------------------------------------------------------------------------------------------------------
	Homework-007.2 sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte işlenmiş olan konulara göre yazılmıştır)
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String[] args)
    {
        PrintRandomDateTest.run();
    }
}

class PrintRandomDateTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        java.util.Random r = new java.util.Random();
        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        while (count-- > 0)
            DateUtil.printRandomDate(r);

        System.out.println("Tekrar yapıyor musunuz?");

    }
}

class DateUtil {
    public static void printRandomDate(java.util.Random r)
    {
        int year = r.nextInt(1900, 2101);
        int month = r.nextInt(1, 13);
        int day = r.nextInt(1, getDays(month, year) + 1);

        printDate(day, month, year);
    }

    public static void printDate(int day, int month, int year)
    {
        System.out.print(day);
        printDaySuffix(day);
        System.out.print(' ');
        printMonth(month);
        System.out.print(' ');
        System.out.println(year);
    }

    public static void printDaySuffix(int day)
    {
        System.out.print(
            switch (day) {
                case 1, 21, 31 -> "st";
                case 2, 22 -> "nd";
                case 3, 23 -> "rd";
                default -> "th";
            }
        );
    }

    public static void printMonth(int month)
    {
        System.out.print(
            switch (month) {
                case 1 -> "Jan";
                case 2 -> "Feb";
                case 3 -> "Mar";
                case 4 -> "Apr";
                case 5 -> "May";
                case 6 -> "Jun";
                case 7 -> "Jul";
                case 8 -> "Aug";
                case 9 -> "Sep";
                case 10 -> "Oct";
                case 11 -> "Nov";
                default -> "Dec";
            }
        );
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
                totalDays += isLeapYear(year) ? 29 : 28;
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
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

