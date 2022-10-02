/*-----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki durumlardan en az biri varsa veri elemanının gizlenmesi gerekir:
	- Sınıfın geliştirilmesi aşamalarında versiyon ilerledikçe bir veri elemanının isminin hatta türünün değişmesi durumu
	ile çok fazla karşılaşılır. Bu durumda daha önce yazılmış olan kofların bu değişimden etkilenmemesi için veri elemanı
	gizlenmelidir.

	- Bir veri elemanının değeri değiştiğinde başka bir veri elemanının değerinin değişen veri elemanına göre yeniden
	belirlenmesi gerekebilir. Bu durumda da veri elemanı gizlenmelidir.

	- Bir veri elemanının değeri değiştiğinde yeni değere göre bazı işlemlerin yapılması gerekebilir. Örneğin bir veri
	elemanı açık olan işlem yapılan bir dosyanın ismini tutuyor olabilir. Bu durumda bu veri değiştiğinde eski dosyanın
	kapatılıp yeni dosyanın açılması gerektiği gibi bir durumda veri elemanı gizlenmelidir

	- Bir veri elemanının sınır değerleri olabilir. Bu değerlerin kontrol edilip değiştirilebilmesi için veri elemanı
	gizlenmelidir

	Bazen bu durumlar dışındaki özel durumlarda da gizleme yapılabilir. Bu tarz durumlar ileride ele alınacaktır.

	Yukarıdaki durumlar dışında (%3 ile %5 arası) sınıfın veri elemanları public yapılabilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date date = new Date(6, 9, 2021);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());

		date.setDay(10);
		date.setYear(1976);

		System.out.printf("%02d/%02d/%04d%n", date.getDay(), date.getMonth(), date.getYear());
	}
}

class Date {
	private int m_day, m_month, m_year;

	public Date(int day, int month, int year)
	{
		//...
		m_day = day;
		m_month = month;
		m_year = year;
	}

	public int getDay()
	{
		return m_day;
	}

	public void setDay(int day)
	{
		//...
		m_day = day;
	}

	public int getMonth()
	{
		return m_month;
	}

	public void setMonth(int month)
	{
		//...
		m_month = month;
	}

	public int getYear()
	{
		return m_year;
	}

	public void setYear(int year)
	{
		//...
		m_year = year;
	}

	//...
}