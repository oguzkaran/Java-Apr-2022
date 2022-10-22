/*------------------------------------------------------------------
	FILE		: ComplexCommon.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 16.10.2022

	Friendly ComplexCommon class for Complex and MutableComplex

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.math;

class ComplexCommon {
    private ComplexCommon()
    {
    }

    static String toString(double real, double imag)
    {
        return String.format("(%f, %f)", real, imag);
    }

}
