/*------------------------------------------------------------------
	FILE		: PointCommon.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022

	Friendly PointCommon class for Point and MutablePoint

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

import static java.lang.Math.*;

class PointCommon {
    private PointCommon()
    {}

    public static double distance(double x1, double y1, double x2, double y2)
    {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
