/*-----------------------------------------------------------------------------------------------------------------------
	Bir referansın iki tane türü vardır: static, dynamic
	- static tür (static type): Referansın bildirildiği türdür. "Referansın türü" dendiğinde static tür anlaşılır. Derleme
	zamanına ilişkin bir bilgidir ve değişmez.

	- dinamik tür (dynamic type): Referansın gösterdiği nesnenin gerçek türüdür. Çalışma zamanına ilişkindir ve değişebilir

	Anahtar Notlar: Bir referansın dinamik türü String olarak aşağıdaki biçimde elde edilebilir:
		<referans>.getClass().getName();
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
	public static void main(String [] args)
	{
		RandomAFactory factory = new RandomAFactory();
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int count = kb.nextInt();

		while (count-- > 0) {
			A x = factory.getRandomA();

			System.out.println(x.getClass().getName());
			System.out.println("------------------------------");
		}

		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class RandomAFactory {
	private final Random m_random = new Random();

	public A getRandomA()
	{
		int val = m_random.nextInt(5);

		return switch (val) {
			case 0 -> new A();
			case 1 -> new B();
			case 3 -> new C();
			case 4 -> new D();
			default -> new E();
		};
	}
}

class E extends C {
	//...
}

class D extends A {
	//...
}

class C extends B {
	//...
}

class B extends A {
	//...
}

class A {
	//...
}

