/*-----------------------------------------------------------------------------------------------------------------------
	Taban sınıfın metotları türemiş sınıfa da aktarılır. Aşağıdaki örnekte foo ve bar metotları B sınıfında da vardır. Aynı
	zamanda bu metotlar B 'den de C'ye aktarılmıştır. Bu kavrama "davranışsal genişletme (behavioral extension)" da denir.
	"extension" terimi tek başına kullanıldığında genel olarak veri elemanı ekleyerek anlamına gelir. Metot eklemek de
	bir genişletmedir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		B b = new B();

		b.foo();
		b.bar();
		b.tar();

		C c = new C();

		c.foo();
		c.bar();
		c.tar();
		c.car();
	}
}


class C extends B {
	public void car()
	{
		System.out.println("C.car");
	}
}

class B extends A {
	//...
	public void tar()
	{
		System.out.println("B.tar");
	}
}

class A {
	//...
	public void foo()
	{
		System.out.println("A.foo");
	}

	public void bar()
	{
		System.out.println("A.bar");
	}
}

