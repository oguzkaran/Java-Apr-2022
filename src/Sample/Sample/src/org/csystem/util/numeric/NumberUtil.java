/*------------------------------------------------------------------
	FILE		: NumberUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 18.04.2023
	
	NumberUtil class for numeric operations
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.numeric;

import static java.lang.Math.*;

public final class NumberUtil {
	private static final String [] ONES_TR = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
	private static final String [] TENS_TR = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

	private NumberUtil()
	{}

	private static int [] getDigits(long a, int n)
	{
		int [] digits = new int[(int)(log10(abs(a)) / n) + 1];

		a = abs(a);
		int powOfTen = (int)pow(10, n);

		for (int i = digits.length - 1; i >= 0; digits[i] = (int)(a % powOfTen), a /= powOfTen, --i)
			;

		return digits;
	}

	private static String numToText3DigitsTR(int a, int b, int c)
	{
		String str = "";

		if (a != 0) {
			if (a != 1)
				str += ONES_TR[a];

			str += "yüz";
		}

		if (b != 0)
			str += TENS_TR[b];

		if (c != 0)
			str += ONES_TR[c];

		return str;
	}

	private static String numToText3DigitsTR(int val)
	{
		if (val == 0)
			return "sıfır";

		String str = val < 0 ? "eksi" : "";

		val = Math.abs(val);

		return str + numToText3DigitsTR(val / 100, val / 10 % 10, val % 10);
	}

	public static boolean areFriends(int a, int b)
	{
		return sumFactors(a) == b && sumFactors(b) == a;
	}

	public static int calculateDigitalRoot(int a)
	{
		int root = abs(a);

		while ((root = digitsSum(root)) > 9)
			;

		return root;
	}

	public static int countDigits(long a)
	{
		return a == 0 ? 1 : (int)log10(abs(a)) + 1;
	}

	public static int digitsFactorialSum(int n)
	{
		int sum = 0;

		while (n != 0) {
			sum += factorial(n % 10);
			n /= 10;
		}

		return sum;
	}

	public static int digitsSum(long a)
	{
		int sum = 0;

		do {
			sum += a % 10;
			a /= 10;
		} while (a != 0);

		return sum;
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

	public static int [] getDigits(long a)
	{
		return getDigits(a, 1);
	}

	public static int [] getDigitsInTwos(long a)
	{
		return getDigits(a, 2);
	}

	public static int [] getDigitsInThrees(long a)
	{
		return getDigits(a, 3);
	}

	public static int getDigitsPowSum(int a)
	{
		int n = countDigits(a);
		int total = 0;

		while (a != 0) {
			total += pow(a % 10, n);
			a /= 10;
		}

		return total;
	}

	public static int getHardyRamanujanPairCount(int a)
	{
		int count = 0;

		EXIT_LOOP:
		for (int x = 1; x * x * x < a; ++x)
			for (int y = x + 1; x * x * x + y * y * y <= a; ++y) {
				if (x * x * x + y * y * y == a) {
					if (++count == 2)
						break EXIT_LOOP;

					++x;
				}
			}

		return count;
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

	public static int indexOfPrime(long a)
	{
		int i = 1;
		long val = 2;

		for (;;) {
			if (val == a)
				return i;

			if (isPrime(val))
				++i;

			++val;
		}
	}

	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}

	public static boolean isDecimalHarshad(int a)
	{
		return  a > 0 && a % digitsSum(a) == 0;
	}

	public static boolean isHardyRamanujan(int a)
	{
		return  a > 0 && getHardyRamanujanPairCount(a) == 2;
	}

	public static boolean isPerfect(int a)
	{
		return sumFactors(a) == a;
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

	public static boolean isPrimeX(long a)
	{
		boolean result;

		for (long sum = a; (result = isPrime(sum)) && sum > 9; sum = digitsSum(sum))
			;

		return result;
	}


	public static boolean isSuperPrime(long a)
	{
		return isPrime(a) && isPrime(indexOfPrime(a));
	}

	public static double log(double a, double b)
	{
		return log10(b) / log10(a);
	}

	public static int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}

	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;

		if (b <= a && a <= c || c <= a && a <= b)
			return a;

		return c;
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

	public static String numToTextTR(long val)
	{
		//TODO:
		return numToText3DigitsTR((int)val);
	}

	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz sayı");
			return;
		}

		System.out.println(n);

		while (n != 1)
			System.out.println(n = (n % 2 == 0) ? (n / 2) : (3 * n + 1));
	}


	public static void printPrimeFactors(int a)
	{
		if (a == 0)
			return;

		a = abs(a);

		int n = 2;

		while (a != 1) {
			if (a % n == 0) {
				System.out.printf("%d ", n);
				a /= n;
			}
			else
				++n;
		}

		System.out.println();
	}

	public static void printGoldbach(int a)
	{
		for(int x = 2; x < a; ++x) {
			int y = a - x;

			if (isPrime(x) && isPrime(y) && x <= y)
				System.out.printf("%d + %d = %d == %d%n", x, y, x + y, a);
		}
	}

	public static int sumDigits(int a)
	{
		int sum = 0;

		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return abs(sum);
	}

	public static int sumFactors(int a)
	{
		return (int)sumFactors((long)a);
	}

	public static long sumFactors(long a)
	{
		long result = 1;
		long sqrtVal = (long)sqrt(a);

		for (long i = 2; i <= sqrtVal; ++i)
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);

		return result;
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
