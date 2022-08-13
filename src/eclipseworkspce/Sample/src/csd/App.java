/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden denklemin köklerini bulup ekrana yazdıran 
	programı yazınız.
	Açıklamalar:
	- İki kök varsa örneğin 
		x1 = 3, x2 = 4 
	biçiminde ekrana yazılacaktır
	- Çakışık kök varsa 
		x1 = x2 = -4 
	biçiminde ekrana yazılacaktır
	- Gerçek kök yoksa 
		Gerçek kök yok!... 
	biçiminde ekrana yazılacaktır	
	
	
	Sınıfın aşağıdaki gibi kullanım şekli sınıfların yararı 100 birim düşünülürse %1'den daha azdır. Şüphesiz örnek 
	farklı yaklaşımlarla da yazılabilir. Sınıfın bir kullanımını göstermek için yazılmıştır. İleride daha iyisi yazılacaktır 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		SecondOrderEquationSolverApp.run();		
	}
}

class SecondOrderEquationSolverApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("İkinci dereceden denklemin katsayılarını giriniz:(a, b, c)");
		double a = kb.nextDouble();		
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		SecondOrderEquationRootInfo ri = SecondOrderEquationSolver.findRoots(a, b, c);
		
		if (ri.exists)
			System.out.printf("x1 = %f, x2 = %f%n", ri.x1, ri.x2);
		else
			System.out.println("Gerçek kök yok");
	}
}

class SecondOrderEquationRootInfo {
	public double x1, x2;
	public boolean exists;
}

class SecondOrderEquationSolver {
	public static void doWorkForSuccess(SecondOrderEquationRootInfo ri, double delta, double a, double b)
	{
		double sqrtDelta = Math.sqrt(delta);
		
		ri.exists = true;
		ri.x1 = (-b + sqrtDelta) / (2 * a);
		ri.x2 = (-b - sqrtDelta) / (2 * a);
	}
	
	
	public static double getDelta(double a, double b, double c)
	{
		return b * b - 4 * a * c;
	}
	
	public static SecondOrderEquationRootInfo findRoots(double a, double b, double c)
	{
		double delta = getDelta(a, b, c);
		
		SecondOrderEquationRootInfo ri = new SecondOrderEquationRootInfo();
		
		if (delta >= 0)
			doWorkForSuccess(ri, delta, a, b);
		
		return ri;		
	}
	
}
