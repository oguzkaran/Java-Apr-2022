/*----------------------------------------------------------------------------------------------------------------------
	enum class ile Singleton sınıf bildirimi. Lazy implememanbtation gerekmedikçe ve özel bir durum da yoksa Java'da
	Singleton sınıf için en iyi implementasyon enum ile yapılır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Singleton s1 = Singleton.INSTANCE;
		Singleton s2 = Singleton.INSTANCE;

		System.out.println(s1 == s2 ? "Aynı nesne" : "Farklı nesneler");
	}
}

enum Singleton {
	INSTANCE;
	private int m_value;
	//...
	public int getValue()
	{
		return m_value;
	}

	public void setValue(int value)
	{
		m_value = value;
	}

	//...
}
