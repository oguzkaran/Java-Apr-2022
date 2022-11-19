/*------------------------------------------------------------------
	FILE		: AnalyticalCircle.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 19.11.2022

	AnalyticalCircle class that represents a circle in Cartesian
	plane

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private static final double DELTA = 0.0001;

    private final MutablePoint m_center;

    public AnalyticalCircle()
    {
        this(0, 0);
    }

    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public AnalyticalCircle(double x, double y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, double x,  double y)
    {
        super(radius);
        m_center = MutablePoint.createCartesian(x, y);
    }

    public double getX()
    {
        return m_center.getX();
    }

    public void setX(double x)
    {
        m_center.setX(x);
    }

    public double getY()
    {
        return m_center.getY();
    }

    public void setY(double y)
    {
        m_center.setY(y);
    }

    public void offset(double dx, double dy)
    {
        m_center.offset(dx, dy);
    }

    public void offset(double dxy)
    {
        offset(dxy, dxy);
    }

    public double centerDistance(AnalyticalCircle other)
    {
        return m_center.distance(other.m_center);
    }

    public boolean isTangent(AnalyticalCircle other)
    {
        return Math.abs(getRadius() + other.getRadius() - centerDistance(other)) < DELTA;
    }

    public String toString()
    {
        return String.format("%s, x: %f, y: %f", super.toString(), m_center.getX(), m_center.getY());
    }
    //...
}
