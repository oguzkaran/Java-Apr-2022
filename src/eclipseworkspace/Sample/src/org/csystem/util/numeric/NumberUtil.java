/*------------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 10.09.2022
	
	NumberUtil class for numeric operations
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.numeric;

public class NumberUtil {	
	public static int countDigits(int a)
	{				
		return a == 0 ? 1 : (int)Math.log10(Math.abs(a)) + 1;
	}

	public static long factorial(int n)
	{
		long result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	
	}	
	
	public static int fibonacciNumber(int n)
	{
		if (n <= 2)
			return n - 1;
		
		int prev1 = 1, prev2 = 0, val = 0;
		
		for (int i = 2; i < n; ++i) {
			val = prev1 + prev2;
			prev2 = prev1;
			prev1 = val;
		}
		
		return val;
	}

	public static int getDigitsPowSum(int a)
	{
		int n = countDigits(a);
		int total = 0;
		
		while (a != 0) {
			total += Math.pow(a % 10, n);
			a /= 10;
		}
		
		return total;
	}

	public static long getNextPrime(long n)
	{		
		for (++n; !isPrime(n); ++n)
			;
		
		return n;
	}	

	
	public static long getPrime(int n)
	{
		
		int count = 0;
		int a = 2;
		
		for (;;) {
			if (isPrime(a))
				++count;
			
			if (count == n)
				return a;
			
			++a;
		}
	}

	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;				
	}
	
	public static double log(double a, double b)
	{
		return Math.log(b) / Math.log(a);
	}	

	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public static int min(int a, int b, int c)
	{
		return Math.min(Math.min(a, b), c);
	}	

	public static int nextFibonacciNumber(int a)
	{
		if (a < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;
		
		for (;;) {
			next = prev1 + prev2;
			
			if (a < next)
				return next;
			
			prev2 = prev1;
			prev1 = next;
		}
	}	

	public static int sumDigits(int a)
	{
		int sum = 0;
		
		while (a != 0) {
			sum += a % 10;
			a /= 10;			
		}
		
		return Math.abs(sum);
	}


	public static int reverse(int a)
	{
		int result = 0;
		
		while (a != 0) {
			result = result * 10 + a % 10;
			a /= 10;
		}
		
		return result;
	}
}
