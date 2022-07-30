/*-----------------------------------------------------------------------------------------------------------------------	
	1. Aday Metotlar: 1, 2, 3, 4, 5, 6
	2. Uygun metotlar: 3, 4
	3. En uygun metot yok: yok
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a = 10;
		int b = 3;
		
		Sample.foo(a, b); //error: ambiguity	
	}
}

class Sample {
	public static void foo() //1
	{		
		System.out.println("Sample.foo()");
	}
	
	public static void foo(int x) //2
	{
		System.out.println("Sample.foo(int)");
	}
	
	
	public static void foo(int x, long y) //3
	{
		System.out.println("Sample.foo(int, long)");		
	}
	
	public static void foo(double y, int x) //4
	{
		System.out.println("Sample.foo(double, int)");		
	}
	
	public static void foo(short y, int x) //5
	{
		System.out.println("Sample.foo(short, int)");		
	}
	
	public static void bar(double y, int x) //6
	{
		System.out.println("Sample.bar(double, int)");		
	}

}

