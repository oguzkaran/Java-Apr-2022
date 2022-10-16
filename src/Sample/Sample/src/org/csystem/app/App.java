/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Daha önce yazmış olduğumuz Point sınıfını aşağıdaki açıklamalara göre tasarlayıp yazınız
	Açıklamalar:
		- Point sınıfı immutable olarak yazılacaktır. Ayrıca mutable versiyonu olan MutablePoint sınıfı da yazılacaktır
		- Point ve MutablePoint sınıfları koordinat bilgilerini "kutupsal (polar)" olarak da alacaktır. Kutupsal koordinatlara
		ilişkin double türden yarıçap (r) ve double türden theta radyan biriminde açı girişleri için aşağıdaki formüllerle
		x ve y belirlenebilir:
				x = r * cos(theta)
				y = r * sin(theta)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.Point;

class App {
	public static void main(String [] args)
	{
		Point p = Point.createCartesian(100, 100);
		Point pp = Point.createPolar(100, 100);

		System.out.println(p.toString());
		System.out.println(pp.toString());
	}
}

