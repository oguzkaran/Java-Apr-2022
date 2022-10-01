/*-----------------------------------------------------------------------------------------------------------------------
	İstenirse toCharArray metodu ile tüm karakterler yine for-each döngü deyimi ile dolaşılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		String s = "ankara";

		for (char c : s.toCharArray())
			System.out.printf("%c ", c);

		System.out.println();
	}
}

