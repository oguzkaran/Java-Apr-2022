/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağdaki açıklamalara göre getHistogramData isimli metodu ArrayUtil sınıfı içerisinden yazınız ve
	aşağıdaki kod ile test ediniz:
	Açıklamalar:
		- Metot int türden bir dizi ve int türden bir n sayısı alacaktır
			int [] getHistogramData(int [] a, int n)
		- Metot a dizisi içerisinde [0, n] arasındaki sayılardan hangisinin kaç tane olduğunu içeren bir sayaç dizisine
		geri dönecektir.

		- Sayaç dizisinin her bir indeks numarası [0, n] aralığındaki sayıyı temsil edecektir. Yani örneğin 3 numaralı
		indeksteki değer 3 sayısının kaç tane olduğu bilgisini içerecektir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.test.GetHistogramDataTest;

class App {
	public static void main(String [] args)
	{
		GetHistogramDataTest.run();
	}
}
