/*-----------------------------------------------------------------------------------------------------------------------
	Sınıfın protected bölümü farklı paketlerdeki diğer sınıflar için "türetme/kalıtım (inheritance)" söz konusu değilse
	private anlamındadır. Farklı pakette, ancak "türemiş sınıf (derived/sub class)" kendisine aşt protected bölüme
	erişebilir. Türetme ve protected bölümün anlamı ileride detaylı olarak ele alınacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
	}
}

class B {
	public void bar()
	{
		A a = new A();

		a.x = 20;
		a.foo();
	}
}



class A {
	protected int x;
	protected A()
	{
		//...
	}

	protected void foo()
	{
		//...
	}
}