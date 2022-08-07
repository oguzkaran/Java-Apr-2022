/*-----------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte değer türü kullanıldığından a'nın değeri artırıldığında b'nin değeri değişmez
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Sample s, k;
		
		s = new Sample();
		
		k = s;
		
		s.x = 10;
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("k.x = %d%n", k.x);
		System.out.println("-------------------------------------------");
		
		++s.x;
		
		System.out.printf("s.x = %d%n", s.x);
		System.out.printf("k.x = %d%n", k.x);
		System.out.println("-------------------------------------------");		
		
	}
}

class Sample {
	public int x;	
	//...
}

