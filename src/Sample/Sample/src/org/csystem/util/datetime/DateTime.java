/*------------------------------------------------------------------
	FILE		: DataTime.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 19.11.2022

	Date class that represents a date

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

public class DateTime {
    private final Date m_date;
    private final Time m_time;

    public DateTime(int day, Month month, int year)
    {
        this(day, month, year, 0, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute)
    {
        this(day, month, year, hour, minute, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second)
    {
        this(day, month, year, hour, minute, second, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second, int millisecond)
    {
        m_date = new Date(day, month, year);
        m_time = new Time(hour, minute, second, millisecond);
    }

    public int getDay()
    {
        return m_date.getDay();
    }

    public void setDay(int day)
    {
        m_date.setDay(day);
    }

    public int getMonthValue()
    {
        return m_date.getMonthValue();
    }

    public void setMonthValue(int monthValue)
    {
        m_date.setMonthValue(monthValue);
    }

    public Month getMonth()
    {
        return m_date.getMonth();
    }

    public void setMonth(Month month)
    {
        m_date.setMonth(month);
    }

    public int getYear()
    {
        return m_date.getYear();
    }

    public void setYear(int year)
    {
        m_date.setYear(year);
    }

    public DayOfWeek getDayOfWeek()
    {
        return m_date.getDayOfWeek();
    }

    public String getDayOfWeekEN()
    {
        return m_date.getDayOfWeekEN();
    }

    public String getDayOfWeekTR()
    {
        return m_date.getDayOfWeekTR();
    }

    public boolean isLeapYear()
    {
        return m_date.isLeapYear();
    }

    public boolean isWeekday()
    {
        return m_date.isWeekday();
    }

    public boolean isWeekend()
    {
        return m_date.isWeekend();
    }

    public int getHour()
    {
        return m_time.getHour();
    }

    public void setHour(int hour)
    {
        m_time.setHour(hour);
    }

    public int getMinute()
    {
        return m_time.getMinute();
    }

    public void setMinute(int minute)
    {
        m_time.setMinute(minute);
    }

    public int getSecond()
    {
        return m_time.getSecond();
    }

    public void setSecond(int second)
    {
        m_time.setSecond(second);
    }

    public int getMillisecond()
    {
        return m_time.getMillisecond();
    }

    public void setMillisecond(int millisecond)
    {
        m_time.setMillisecond(millisecond);
    }


    public String toLongDateStringTR()
    {
        return m_date.toLongDateStringTR();
    }

    public String toLongDateStringEN()
    {
        return m_date.toLongDateStringEN();
    }

    public String toShortDateStringTR()
    {
        return m_date.toShortDateStringTR();
    }

    public String toShortDateStringEN()
    {
        return m_date.toShortDateStringEN();
    }

    public String toShortTimeString()
    {
        return m_time.toShortTimeString();
    }

    public String toLongTimeString()
    {
        return m_time.toLongTimeString();
    }

    public String toStringTR()
    {
        return String.format("%s %s", m_date.toShortDateStringTR(), m_time.toString());
    }

    public String toStringEN()
    {
        return String.format("%s %s", m_date.toShortDateStringEN(), m_time.toString());
    }

    public String toString()
    {
        return String.format("%s %s", m_date.toString(), m_time.toString());
    }

    public String toLongDateTimeStringTR()
    {
        return String.format("%s %s", m_date.toLongDateStringTR(), m_time.toString());
    }

    public String toLongDateTimeStringEN()
    {
        return String.format("%s %s", m_date.toLongDateStringEN(), m_time.toString());
    }
}
