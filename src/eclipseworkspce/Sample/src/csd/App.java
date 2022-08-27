/*----------------------------------------------------------------------------------------------------------------------
    Java 11 ile birlikte String sınıfına repeat metodu eklenmiştir    
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void  main(String [] args)
	{
		RepeatTest.run();
	}
}

class RepeatTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.print("Bir sayı giriniz:");
			int count = Integer.parseInt(kb.nextLine());
			
			System.out.println(s.repeat(count));
			
			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

