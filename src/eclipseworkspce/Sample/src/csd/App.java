/*-----------------------------------------------------------------------------------------------------------------------	
	Sınıf Çalışması: Aşağıda açıklanan metotları StringUtil içerisinde yazınız ve aşağıdaki kod ile test ediniz
		public static String padLeading(String s, int len, char ch);
		public static String padLeading(String s, int len);
		public static String padTrailing(String s, int len, char ch);
		public static String padTrailing(String s, int len);
	Açıklamalar:
	- padLeading metodunun 3 parametreli overload'u ikinci parametresi ile aldığı len, birinci parametresi ile aldığı
	yazının uzunluğundan büyükse yazıyı soldan (baştan) üçüncü parametresi ile aldığı karakter ile doldurulmnuş yeni
	bir String referansına geri dönecektir. Örneğin:
		padLeading("istanbul", 12, 'x'); çağrısı
		xxxxistanbul 
	yazısını döndürecektir. 
	
	- len yazının uzunluğundan küçük veya eşitse aynı referansa dönecektir
	
	- padLeading metodunun 2 parametreli overload'u yazıyı soldan (baştan) space karakteri ile dolduracaktır
	
	- padTrailing metotları benzer şekilde sağdanb (sondan) dolduracak şekilde yazılacaktır
	
	- Örneği Java 11+ için yazınız
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		PadLeadingTrailingTest.run();
	}
}

class PadLeadingTrailingTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println("Bir sayı giriniz:");
			int len = Integer.parseInt(kb.nextLine());
			
			System.out.printf("(%s)%n", StringUtil.padLeading(s, len, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, len));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, len, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, len));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}

class StringUtil {
	public static String padLeading(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padLeading(String s, int len)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len, char ch)
	{
		//TODO:
	}
	
	public static String padTrailing(String s, int len)
	{
		//TODO:
	}
}