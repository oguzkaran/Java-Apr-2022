/*------------------------------------------------------------------
	FILE		: Complex.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 08.10.2022
	
	Complex class that represents a complex number
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */

package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class Complex {
	private double m_real;
	private double m_imag;
	
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
	
	public Complex() 
	{}
	
	public Complex(double real)
	{
		setReal(real);
	}
	
	public Complex(double real, double imag)
	{
		setReal(real);
		setImag(imag);
	}

	public double getReal()
	{
		return m_real;
	}

	public void setReal(double real)
	{
		m_real = real;
	}

	public void setImag(double imag)
	{
		m_imag = imag;
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
	
	public void inc(double value)
	{
		m_real += value;
	}
	
	public void inc()
	{
		inc(1);
	}
	
	public void dec(double value)
	{
		inc(-value);
	}
	
	public void dec()
	{
		dec(1);
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", m_real, m_imag);
	}
}