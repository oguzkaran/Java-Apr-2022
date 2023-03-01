/*------------------------------------------------------------------
	FILE		: DateTimeException.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 01.03.2023

	DateTimeException class

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.datetime;

public class DateTimeException extends IllegalArgumentException {
    public DateTimeException(String message)
    {
        this(message, null);
    }

    public DateTimeException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
