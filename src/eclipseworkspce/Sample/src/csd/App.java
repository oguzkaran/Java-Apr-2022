/*-----------------------------------------------------------------------------------------------------------------------	
	continue deyimi döngüyü değil döngünün o anki adımını sonlandırır. continue deyiminin de etiketli biçimi vardır. Ancak
	yapısal programlama ve nesne yönelimli programlama açısından kullanımı tavsiye edilmez. continue deyiminin etitketsiz
	biçimi break deyimi kadar sık kullanılmasa da bazı durumlarda okunabilirliği/algılanabilirliği artırır. continue
	deyimi yalnızca döngü deyimlerinde kullanılabilir
	
	Aşağıdaki örnekte 1 ile klavyeden girilen sayı arasındaki çift sayılar continue deyimi kullanılarak ekrana 
	bastırılmıştır. Şüphesiz daha kolay yazılabilir. Sadece constinue deyiminin çalışma prensibinin anlaşılabilmesi için 
	bu şekilde yazılmıştır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = kb.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			if (i % 2 != 0)
				continue;
			
			System.out.printf("%d ", i);
		}
		
		System.out.println();
	}
}

