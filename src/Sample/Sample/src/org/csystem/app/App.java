/*-----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte getNumbers metodu içsel olarak tutulan dizinin elemanlarından oluşan yeni bir (newly allocated)
	dizi döndürmektedir. Bu durumda içsel olarak tutulan dizinin elemanları dışarıdan değiştirilemez.

	Anahtar Notlar: java.util.Arrays sınıfının copyOf metotları birinci parametresi ile aldığı dizinin, ikinci parametresi
	ile aldığı uzunluk kadar elemanlarından oluşan yeni bir dizinin referansına geri döner. Bu durumda ikinci porametre
	için dizinin uzunluğu argüman olarak verilirse, dizinin tamamının kopyası çıkartılmış olur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.generator.random.RandomIntGenerator;

import java.util.Random;

class App {
	public static void main(String [] args)
	{
		RandomIntGenerator generator = new RandomIntGenerator(new Random(), 10, 0, 99);
		int [] a = generator.getNumbers();

		ArrayUtil.print(a);
		ArrayUtil.addBy(a, 4);
		ArrayUtil.print(a);
		ArrayUtil.print(generator.getNumbers());
	}
}


