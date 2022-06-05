/*-----------------------------------------------------------------------------------------------------------------------	
	Java'da void bir metot çağrısı "void expression" olarak ele alınır. Yani bir ifadedir ancak bir değer üretmez
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		NumberUtil.print(10, 20);
	}
}

class NumberUtil {
	public static void print(int a, int b)
	{
		System.out.printf("%d, %d%n", a, b);
	}
}