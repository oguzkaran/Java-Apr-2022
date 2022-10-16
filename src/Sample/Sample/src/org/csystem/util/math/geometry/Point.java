/*------------------------------------------------------------------
	FILE		: Point.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022
	
	Point class that represents a 2(two) dimensional point in Cartesian
	plane
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private double m_x;
	private double m_y;

	Point(Point p)
	{
		m_x = p.m_x;
		m_y = p.m_y;
	}

	private Point(double a, double b, boolean polar)
	{
		if (polar) {
			m_x = a * Math.cos(b);
			m_y = a * Math.sin(a);
		}
		else  {
			m_x = a;
			m_y = b;
		}
	}

	public static Point createCartesian()
	{
		return createCartesian(0);
	}

	public static Point createCartesian(double x)
	{
		return createCartesian(x, 0);
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar(double radius, double theta)
	{
		return new Point(radius, theta, true);
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

	public double distance(double a, double b)
	{
		return sqrt(pow(m_x - a, 2) + pow(m_y - b, 2));
	}
	
	public double distance(Point other)
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
	
	public String toString()
	{
		return String.format("(%f, %f)", m_x, m_y);
	}
}
