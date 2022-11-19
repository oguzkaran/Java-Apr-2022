/*------------------------------------------------------------------
	FILE		: TimeUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 19.11.2022

	Utility class for Time operations

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

import java.util.Random;

public class TimeUtil {
	private TimeUtil()
	{
	}

	public static Time randomTime()
	{
		return randomTime(new Random());
	}
	public static Time randomTime(Random r)
	{
		return new Time(r.nextInt(24), r.nextInt(60), r.nextInt(60), r.nextInt(1000));
	}
}
