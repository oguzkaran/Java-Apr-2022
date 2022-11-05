/*------------------------------------------------------------------
	FILE		: Month.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 05.11.2022

	enum class for months

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

enum Month {
	JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
	private final int m_days;

	static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	Month(int days)
	{
		m_days = days;
	}

	public int getDaysByYear(int year)
	{
		return ordinal() == 1 && isLeapYear(year) ? 29 : m_days;
	}
}