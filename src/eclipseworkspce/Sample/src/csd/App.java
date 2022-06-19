/*-----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte 3 basamaklı Armstrong sayıları içiçe döngü ile ekrana bastırılmıştır. İçiçe döngüyü göstermek
	için kod bu şekilde yazılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		for (int a = 1; a <= 9; ++a)
			for (int b = 0; b <= 9; ++b)
				for (int c = 0; c <= 9; ++c)
					if (100 * a + 10 * b + c == a * a * a + b * b * b + c * c * c)
						System.out.printf("%d%d%d%n", a, b, c);
	}
}

