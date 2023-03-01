/*------------------------------------------------------------------
	FILE		: MathException.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 01.03.2023

	MathException class

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math;

public class MathException extends IllegalArgumentException {
    private final MathExceptionStatus m_mathExceptionStatus;

    public MathException(String message, MathExceptionStatus mathExceptionStatus)
    {
        super(message);
        m_mathExceptionStatus = mathExceptionStatus;
    }

    public MathExceptionStatus getMathExceptionStatus()
    {
        return m_mathExceptionStatus;
    }
}
