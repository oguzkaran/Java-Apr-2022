/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıfın static bir veri elemanına sınıf dışından referans ve nokta operatörü ile erişilebilir. Sınıf ismi ile
	erişmekten farkı yoktur. Sınıfın static veri elemanlarına bu şekilde erişim okunabilirlik/algılanabilirlik 
	açısından edilmemelidir
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Sample s = new Sample();
		
		s.x = 10; //Gönlümüzün error'u
		s.y = true; //Gönlümüzün error'u
		
		System.out.printf("Sample.x = %d%n", Sample.x);
		System.out.printf("Sample.y = %b%n", Sample.y);
	}
}

class Sample {
	public static int x;
	public static boolean y;
	//...
}