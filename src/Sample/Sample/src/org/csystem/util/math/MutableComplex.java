/*------------------------------------------------------------------
	FILE		: MutableComplex.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 23.10.2022
	
	MutableComplex class that represents a complex number
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class MutableComplex {
	private double m_real;
	private double m_imag;

	private static MutableComplex add(double re1, double im1, double re2, double im2)
	{
		return new MutableComplex(re1 + re2, im1 + im2);
	}

	private static MutableComplex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}

	private static MutableComplex multiply(double re1, double im1, double re2, double im2)
	{
		return new MutableComplex(re1 * re2 - im1 * im2, re1 * im2 + re2 * im1);
	}

	private MutableComplex(double theta)
	{
		m_real = Math.cos(theta);
		m_imag = Math.sin(theta);
	}

	private MutableComplex(double real, double imag)
	{
		setReal(real);
		setImag(imag);
	}

	public static MutableComplex create()
	{
		return create(0);
	}

	public static MutableComplex create(double real)
	{
		return create(real, 0);
	}

	public static MutableComplex create(double real, double imag)
	{
		return new MutableComplex(real, imag);
	}

	public static MutableComplex createByAngle(double theta)
	{
		return new MutableComplex(theta);
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
	
	public MutableComplex getConjugate()
	{
		return new MutableComplex(m_real, -m_imag);
	}
	
	public static MutableComplex add(double value, MutableComplex z)
	{
		return add(value, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex add(double value)
	{
		return add(m_real, m_imag, value, 0);
	}
	
	public MutableComplex add(MutableComplex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	public static MutableComplex subtract(double value, MutableComplex z)
	{
		return subtract(value, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex subtract(double value)
	{
		return subtract(m_real, m_imag, value, 0);
	}
	
	public MutableComplex subtract(MutableComplex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}	
	
	public static MutableComplex multiply(double value, MutableComplex z)
	{
		return multiply(value, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex multiply(double value)
	{
		return multiply(m_real, m_imag, value, 0);
	}
	
	public MutableComplex multiply(MutableComplex other)
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

	public Complex toComplex()
	{
		return Complex.create(m_real, m_imag);
	}
	
	public String toString()
	{
		return ComplexCommon.toString(m_real, m_imag);
	}
}