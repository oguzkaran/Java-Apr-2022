/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Yukarıdaki uygulamanın kullanıcı adını bir yerden okuyan 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void  main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("[%s]%n", s);
			System.out.printf("[%s]%n", s.trim());
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

