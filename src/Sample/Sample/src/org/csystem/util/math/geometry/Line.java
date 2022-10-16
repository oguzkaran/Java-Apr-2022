/*------------------------------------------------------------------
	FILE		: Line.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022

	Line class that represents a circle

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

public class Line {
    private final Point m_p1;
    private final Point m_p2;

    //...
    public Line(double x1, double y1, double x2, double y2)
    {
        m_p1 = Point.createCartesian(x1, y1);
        m_p2 = Point.createCartesian(x2, y2);
    }

    public Point getPoint1()
    {
        return m_p1;
    }

    public Point getPoint2()
    {
        return m_p2;
    }

    public double getX1()
    {
        return m_p1.getX();
    }

    public double getY1()
    {
        return m_p1.getY();
    }

    public double getX2()
    {
        return m_p2.getX();
    }

    public double getY2()
    {
        return m_p2.getY();
    }

    public String toString()
    {
        return String.format("%s, %s", m_p1.toString(), m_p2.toString());
    }
}
