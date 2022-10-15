/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte DEBUG veri elemanı final yapılırsa derleyici false olması durumunda ** ile belirtilen if deyimini
	arakoda eklemez. Eğer final yapılmazsa ekler, dolayısıyla gereksi bir kod eklenmiş olur. Yani derleyici optimizasyon
	yapma imkanına sahip olur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Sample s = new Sample();

		s.bar(-10);
	}
}

class Sample {
	private static final boolean DEBUG = false;
	private void foo(int a)
	{
		if (DEBUG) { //**
			if (a < 0)
				System.out.printf("%d can not be negative!...%n", a);
		}

		System.out.printf("foo:%d%n", a);
	}

	public void bar(int a)
	{
		System.out.println("bar");
		a = Math.abs(a);
		foo(a);
	}

	//...
}