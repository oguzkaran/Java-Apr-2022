/*------------------------------------------------------------------
	FILE		: Time.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 19.11.2022

	Time class that represents a time

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

import java.time.LocalTime;

public class Time {
    private int m_hour, m_minute, m_second, m_millisecond;

    private static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemleri konusuna kadar sabredin
    }

    private static boolean isValidForBound(int val, int max)
    {
        return 0 <= val && val <= max;
    }

    private static boolean isValidHour(int hour)
    {
        return isValidForBound(hour, 23);
    }

    private static boolean isValidMinute(int minute)
    {
        return isValidForBound(minute, 59);
    }

    private static boolean isValidSecond(int second)
    {
        return isValidForBound(second, 59);
    }

    private static boolean isValidMillisecond(int millisecond)
    {
        return isValidForBound(millisecond, 999);
    }

    private static boolean isValidTime(int hour, int minute, int second, int millisecond)
    {
        return isValidHour(hour) && isValidMinute(minute) && isValidSecond(second) && isValidMillisecond(millisecond);
    }

    private static void checkTime(int hour, int minute, int second, int millisecond)
    {
        if (!isValidTime(hour, minute, second, millisecond))
            doWorkForException(String.format("Invalid Time: hour -> %d [0, 23], minute -> %d [0, 59], second -> %d [0, 59], millisecond -> %d [0, 999]",
                    hour, minute, second, millisecond));
    }

    private static void checkHour(int val)
    {
        if (!isValidHour(val))
            doWorkForException(String.format("Invalid hour value:%d", val));
    }

    private static void checkMinute(int val)
    {
        if (!isValidMinute(val))
            doWorkForException(String.format("Invalid minute value:%d", val));
    }

    private static void checkSecond(int val)
    {
        if (!isValidSecond(val))
            doWorkForException(String.format("Invalid second value:%d", val));
    }

    private static void checkMillisecond(int val)
    {
        if (!isValidMillisecond(val))
            doWorkForException(String.format("Invalid millisecond value:%d", val));
    }

    public Time() //Bu ctor içerisinde yazılanların bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        LocalTime now = LocalTime.now();

        m_hour = now.getHour();
        m_minute = now.getMinute();
        m_second = now.getSecond();
        m_millisecond = now.getNano() / 1_000_000;
    }

    public Time(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second)
    {
        this(hour, minute, second, 0);
    }

    public Time(int hour, int minute, int second, int millisecond)
    {
        checkTime(hour, minute, second, millisecond);
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = millisecond;
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int hour)
    {
        if (m_hour == hour)
            return;

        checkHour(hour);
        m_hour = hour;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int minute)
    {
        if (m_minute == minute)
            return;

        checkMinute(minute);
        m_minute = minute;
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int second)
    {
        if (m_second == second)
            return;

        checkSecond(second);
        m_second = second;
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }

    public void setMillisecond(int millisecond)
    {
        if (m_millisecond == millisecond)
            return;

        checkHour(millisecond);
        m_millisecond = millisecond;
    }

    public String toString()
    {
        return String.format("%s:%02d", toShortTimeString(), m_second);
    }

    public String toShortTimeString()
    {
        return String.format("%02d:%02d", m_hour, m_minute);
    }

    public String toLongTimeString()
    {
        return String.format("%s.%03d", toString(), m_millisecond);
    }
}
