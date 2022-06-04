/*-----------------------------------------------------------------------------------------------------------------------	
	Operatörler: Bir işleme yol açan ve işlem sonunda bir değer üreten atomlara operatör denir. Operatör ile birlikte 
	işleme giren ifadelere "operand" denir.
	
	Operatörleri 3(üç) biçimde sınıflandırabiliriz:
	1. İşlevlerine göre sınıflandırma:
		- Aritmetik (arithmetic) operatörler
		- Karşılaştırma (comparison) operatörleri
		- Mantıksal (logical) operatörler
		- Bitsel (bitwise) operatörler
		- Özel amaçlı (special purpose) operatörler
		
	2. Operand sayısına göre sınıflandırma:
		- Tek operandlı (unary)
		- İki operandlı (binary)
		- Üç operandlı (ternary)
	3. Operatörün konumuna göre sınıflandırma:
		- önek (prefix)
		- araek (infix)
		- sonek (postfix)
		
	Operatörün kısıtı (constraint)
	Operatörün ürettiği değer (product value)
	Operatörün yan etkisi (side effect) var mı?
	Operatörün önceliği (precedence):
	
	a = b + c * d ifadesinin derleyici tarafında üretilen kodda yapılış sırası:
	i1: c * d
	i2: b + i1
	i3: a = i2
	
	a = (b + c) * d ifadesinin derleyici tarafında üretilen kodda yapılış sırası:
	i1: b + c
	i2: i1 * d
	i3: a = i2
	
	a = b + c - d ifadesinin derleyici tarafında üretilen kodda yapılış sırası:
	i1: b + c
	i2: i1 - d
	i3: a = i2
	
	Anahtar Notlar: Java programcısı bir operatörlerin yukarıdaki durumları iyi bilmelidir. Yani bir 
	operatörün öğrenilmesi için yukarıdaki durumların iyi bilinmesi gerekir.
	
	Anahtar Notlar: Bazı operatörler öncelilik doğrudan uymazlar. Bu tarz operatörlerin de uymadıkları durum için
	nasıl çalıştığının bilinmesi gerekir. Şüphesiz bu operatörlerin öncelik kuralına uymadan işlem yapmasının da
	bir gerekçesi (rationale) vardır.
	
	Anahtar Notlar: Operatör öncelik tablosu gruplandırma olarak düşünülebilir. Yani operatör öncelik tablosundaki
	öncelik durumlarının yapılış biçimine ilişkin istisnaları olabilir. Şüphesiz bunun da bilinmesi gerekir. Operatör
	öncelik tablosu algısal bakımdan kolaylaştırmak için vardır ve önemlidir	
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a = 10, b = 20;
		
		int c;
		
		c = b++;
		
	}
}

