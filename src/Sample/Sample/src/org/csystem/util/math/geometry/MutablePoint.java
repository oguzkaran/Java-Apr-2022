/*------------------------------------------------------------------
	FILE		: MutablePoint.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022
	
	MutablePoint class that represents a 2(two) dimensional point in
	Cartesian plane
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class MutablePoint {
	private double m_x;
	private double m_y;

	private MutablePoint(double a, double b, boolean polar)
	{
		if (polar) {
			m_x = a * cos(b);
			m_y = a * sin(a);
		}
		else  {
			m_x = a;
			m_y = b;
		}
	}

	public static MutablePoint createCartesian()
	{
		return createCartesian(0);
	}

	public static MutablePoint createCartesian(double x)
	{
		return createCartesian(x, 0);
	}

	public static MutablePoint createCartesian(double x, double y)
	{
		return new MutablePoint(x, y, false);
	}

	public static MutablePoint createPolar(double radius, double theta)
	{
		return new MutablePoint(radius, theta, true);
	}

	public double getX()
	{
		return m_x;
	}

	public void setX(double x)
	{
		m_x = x;
	}

	public double getY()
	{
		return m_y;
	}

	public void setY(double y)
	{
		m_y = y;
	}

	public double distance()
	{
		return distance(0, 0);
	}

	public double distance(double x, double y)
	{
		return PointCommon.distance(m_x, m_y, x, y);
	}
	
	public double distance(MutablePoint other)
	{
		return distance(other.m_x, other.m_y);
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		m_x += dx;
		m_y += dy;
	}

	public Point toPoint()
	{
		return Point.createCartesian(m_x, m_y);
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", m_x, m_y);
	}
}
