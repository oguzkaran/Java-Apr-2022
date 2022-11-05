/*-----------------------------------------------------------------------------------------------------------------------
	A ile B arasındaki "composition" ilişkisinin genel bir impelementasyonu
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		A a;

		a = new A(/*...*/);

		a.doWork1();
		a.doWork2();
	}
}

class A {
	private B m_b;

	public A(/*...*/)
	{
		//...
		m_b = new B();
	}

	public void doWork1()
	{
		//...
		m_b.doSomething();
	}

	public void doWork2()
	{
		//...
		m_b.doSomething();
	}

	//...
}

class B {
	//...
	public void doSomething()
	{
		//...
	}
}
