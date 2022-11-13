/*------------------------------------------------------------------
	FILE		: Circle.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 08.10.2022

	Circle class that represents a circle in synthetic geometry

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Circle {
    private double m_radius;

    public Circle()
    {}

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return m_radius;
    }

    public void setRadius(double radius)
    {
        m_radius = abs(radius);
    }

    public double getArea()
    {
        return PI * m_radius * m_radius;
    }

    public double getCircumference()
    {
        return 2 * PI * m_radius;
    }

    public String toString()
    {
        return String.format("Radius: %f, Area:%f, Circumference:%f", m_radius, getArea(), getCircumference());
    }
}
