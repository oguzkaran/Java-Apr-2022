/*------------------------------------------------------------------
	FILE		: Complex.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 22.10.2022
	
	Immutable Complex class that represents a complex number
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */

package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class Complex {
	private final double m_real;
	private final double m_imag;
	
	private static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}

	private static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}

	private static Complex multiply(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}

	private Complex(double theta)
	{
		m_real = Math.cos(theta);
		m_imag = Math.sin(theta);
	}
	
	private Complex(double real, double imag)
	{
		m_real = real;
		m_imag = imag;
	}

	public static Complex create()
	{
		return create(0);
	}

	public static Complex create(double real)
	{
		return create(real, 0);
	}

	public static Complex create(double real, double imag)
	{
		return new Complex(real, imag);
	}


	public static Complex createByAngle(double theta)
	{
		return new Complex(theta);
	}

	public double getReal()
	{
		return m_real;
	}


	public double getImag()
	{
		return m_imag;
	}
	
	public double getLength()
	{
		return getNorm();
	}
	
	public double getNorm()
	{
		return sqrt(m_real * m_real + m_imag * m_imag);
	}
	
	public Complex getConjugate()
	{
		return new Complex(m_real, -m_imag);
	}
	
	public static Complex add(double value, Complex z)
	{
		return add(value, 0, z.m_real, z.m_imag);
	}
	
	public Complex add(double value)
	{
		return add(m_real, m_imag, value, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public static Complex subtract(double value, Complex z)
	{
		return subtract(value, 0, z.m_real, z.m_imag);
	}
	
	public Complex subtract(double value)
	{
		return subtract(m_real, m_imag, value, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}	
	
	public static Complex multiply(double value, Complex z)
	{
		return multiply(value, 0, z.m_real, z.m_imag);
	}
	
	public Complex multiply(double value)
	{
		return multiply(m_real, m_imag, value, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(m_real, m_imag, other.m_real, other.m_imag);
	}

	public String toString()
	{
		return ComplexCommon.toString(m_real, m_imag);
	}
}