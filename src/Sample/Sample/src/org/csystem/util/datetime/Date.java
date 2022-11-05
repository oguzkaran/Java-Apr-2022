/*------------------------------------------------------------------
	FILE		: Date.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 05.11.2022

	Date class that represents a date

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

import java.time.LocalDate;

public class Date {
    private int m_day, m_month, m_year;
    private int m_dayOfWeek;

    private static int getDayOfWeek(int day, int month, int year)
    {
        int totalDays = getDayOfYear(day, month, year);

        for (int y = 1900; y < year; ++y)
            totalDays += Month.isLeapYear(y) ? 366 : 365;

        return totalDays % 7;
    }

    private static String getDaySuffix(int day)
    {
        return switch (day) {
            case 1, 21, 31 -> "st";
            case 2, 22 -> "nd";
            case 3, 23 -> "rd";
            default -> "th";
        };
    }

    private static int getDayOfYear(int day, int month, int year)
    {
        int totalDays = day;

        for (int m = month - 1; m >= 1; --m)
            totalDays += DateUtil.MONTHS[m - 1].getDaysByYear(year);

        return month > 2 && Month.isLeapYear(year) ? totalDays + 1 : totalDays;
    }

    private static boolean isValidDate(int day, int month, int year)
    {
        return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
    }

    private static int getDays(int month, int year)
    {
        return month == 2 && Month.isLeapYear(year) ? 29 : DateUtil.MONTHS[month - 1].getDaysByYear(year);
    }

    private static void doWorkForInvalidData(String msg)
    {
        System.out.println(msg);
        System.exit(1); //Exception işlemleri konusuna kadar sabredin
    }

    private static void checkDate(int day, int month, int year, String message)
    {
        if (!isValidDate(day, month, year))
            doWorkForInvalidData(message);
    }

    private void checkDay(int day, String message)
    {
        checkDate(day, m_month, m_year, message);
    }

    private void checkMonth(int month, String message)
    {
        checkDate(m_day, month, m_year, message);
    }

    private void checkYear(int year, String message)
    {
        checkDate(m_day, m_month, year, message);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    public Date() //Bu ctor içerisinde yazılanların bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        LocalDate today = LocalDate.now();

        set(today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }

    public Date(int day, int monthValue, int year)
    {
        checkDate(day, monthValue, year, String.format("Invalid date value(s) -> day: %d, month: %d, year: %d", day, monthValue, year));
        set(day, monthValue, year);
    }

    public Date(int day, Month month, int year)
    {
        checkDate(day, month.ordinal() + 1, year, String.format("Invalid date value(s) -> day: %d, year: %d", day, year));
        set(day, month.ordinal() + 1, year);
    }

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int day)
    {
        if (day == m_day)
            return;

        checkDay(day, "Invalid day value: " + day);
        set(day, m_month, m_year);
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public void setMonthValue(int monthValue)
    {
        if (monthValue == m_month)
            return;

        checkMonth(monthValue, "Invalid month value: " + monthValue);
        set(m_day, monthValue, m_year);
    }

    public Month getMonth()
    {
        return DateUtil.MONTHS[m_month - 1];
    }

    public void setMonth(Month month)
    {
        setMonthValue(month.ordinal() + 1);
    }

    public int getYear()
    {
        return m_year;
    }

    public void setYear(int year)
    {
        if (year == m_year)
            return;

        checkYear(year, "Invalid year value: " + year);
        set(m_day, m_month, year);
    }

    public DayOfWeek getDayOfWeek()
    {
        return DateUtil.DAY_OF_WEEKS[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return DateUtil.DAY_OF_WEEKS_EN[m_dayOfWeek];
    }

    public String getDayOfWeekTR()
    {
        return DateUtil.DAY_OF_WEEKS_TR[m_dayOfWeek];
    }

    public boolean isLeapYear()
    {
        return Month.isLeapYear(m_year);
    }

    public boolean isWeekday()
    {
        return !isWeekend();
    }

    public boolean isWeekend()
    {
        return m_dayOfWeek == 0 || m_dayOfWeek == 6;
    }

    public String toString()
    {
        return toString('/');
    }

    public String toString(char delimiter)
    {
        return String.format("%02d%c%02d%c%04d", m_day, delimiter, m_month, delimiter, m_year);
    }

    public String toLongDateStringTR()
    {
        return String.format("%s %s", toShortDateStringTR(), getDayOfWeekTR());
    }

    public String toLongDateStringEN()
    {
        return String.format("%s %s", toShortDateStringEN(), getDayOfWeekEN());
    }

    public String toShortDateStringTR()
    {
        return String.format("%d %s %d", m_day, DateUtil.MONTHS_TR[m_month], m_year);
    }

    public String toShortDateStringEN()
    {
        return String.format("%d%s %s %d", m_day, getDaySuffix(m_day), DateUtil.MONTHS_EN[m_month], m_year);
    }
}
