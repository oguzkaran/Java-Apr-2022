/*------------------------------------------------------------------
	FILE		: DateUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 05.11.2022

	Utility class for Date operations

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

import java.util.Random;

public class DateUtil {
	private DateUtil()
	{
	}

	static final DayOfWeek [] DAY_OF_WEEKS = DayOfWeek.values();
	static final Month [] MONTHS = Month.values();

	public static Date randomDate()
	{
		return randomDate(new Random());
	}

	public static Date randomDate(Random r)
	{
		return randomDate(r, new Date().getYear());
	}

	public static Date randomDate(int year)
	{
		return randomDate(new Random(), year);
	}

	public static Date randomDate(Random r, int year)
	{
		return randomDate(r, year, year);
	}

	public static Date randomDate(int minYear, int maxYear)
	{
		return randomDate(new Random(), minYear, maxYear);
	}

	public static Date randomDate(Random r, int minYear, int maxYear)
	{
		int year = r.nextInt(minYear, maxYear + 1);
		int month = r.nextInt(1, 13);
		int day = r.nextInt(1, MONTHS[month - 1].getDaysByYear(year) + 1);

		return new Date(day, month, year);
	}
}
