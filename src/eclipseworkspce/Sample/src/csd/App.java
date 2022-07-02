/*-----------------------------------------------------------------------------------------------------------------------	
	 Aşağıdaki örnekte switch expression, statement biçiminde kullanılmıştır. switch statement karşılığı:
	 switch (plate) {			
		case 34: 
			System.out.println("İstanbul");		
			break;
		case 6:
			System.out.println("Ankara");
			break;
		case 67:
			System.out.println("Zonguldak");
			break;
		default:
			System.out.println("Geçersiz şehir");			
	}
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Plaka numarasını giriniz:");
			int plate = kb.nextInt();
			
			if (plate <= 0)
				break;		
			
		
			switch (plate) {
			case 34 -> System.out.println("İstanbul");
			case 6 -> System.out.println("Ankara");
			case 67 -> System.out.println("Zonguldak");
			default -> System.out.println("Geçersiz şehir");
			}
		}			
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}
