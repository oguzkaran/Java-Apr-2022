/*-----------------------------------------------------------------------------------------------------------------------	
	Farklı Türlerin birbirine atanması (Tür dönüşümleri-type conversions)
	T1 ve T2 birer tür olmak üzere T1 türünden, T2 türüne yapılan atama işlemine T1 türünden T2 türüne 
	"doğrudan dönüşüm (implicit conversion)" denir. Atama işlemi de aynı zamanda bir dönüşümdür. Örneğin bu işlem
	T1 a;
	T2 b;
	
	a = b;
	
	şeklinde belirtilebilir. Konu içerisinde anlatılacak olan istisna durumlar dışında tüm atama işlemleri için bu 
	tanım geçerlidir. Bu durumlar ayrıca ele alınacaktır
	
	Yukarıdaki atama işleminde T2 türüne "kaynak tür (source type)", T1 türüne de "hedef tür (target type)" denir.
	Java'da kaynak türden hedef türe implicit dönüşümünün (atamanın) yapılıp yapılamacağı derleme zamanından belirlenir.
	Kaynak türe ilişkin değere çalışma zamanında bakılarak karar verilmez. Zaten çoğu zaman da bu değer derleme zamanında
	bilinemez. Yani Java'da hangi türlerin hangi türlere doğrudan dönüşebildiği belirlidir.
	
	Java'da genel olarak bilgi kaybına yol açmayacak doğrudan dönüşümler geçerlidir
	
	Anahtar Notlar: "Java Language Specification"'da temel türler (primitive types) arasında, uzunluk (size) olarak büyük olan türden,
	uzunluk olarak küçük olan türe yapılan dönüşüme "daraltma dönüşümü (narrowing conversion)", uzunluk olarak küçük
	olan türden büyük olan türe yapılan dönüşüme "genişletme dönüşümü (widening conversion)" denir. 
	
	Doğrudan dönüşüme ilişkin ayrıntılar konu içerisinde anlatılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		long a = kb.nextLong();		
		int b;
		
		b = a; //error
	}
}

