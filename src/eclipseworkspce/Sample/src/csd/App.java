/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Parametresi ile aldığı bir yazının tersini döndüren reverse isimli metodu StringUtil sınıfı 
	içerisinde yazınız ve aşağıdaki kod yazınız  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void  main(String [] args)
	{
		ReverseTest.run();
	}
}

class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String str = kb.nextLine();
			
			if ("elma".equals(str))
				break;
			
			System.out.printf("Yazının tersi:%s%n", StringUtil.reverse(str));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String reverse(String str)
	{
		//TODO:
	}
}