/*-----------------------------------------------------------------------------------------------------------------------
	  Sabitler:
	  Program içerisinde doğrudan yazılan sayılara denir. Sabitlerin de türleri vardır. Derleyici sabitlerin türlerini
	  tespit ederek işlem yapar.
	  
	  Sabitlerin türlerinin tespitine ilişkin detaylar:
	  - Sayı nokta içermiyorsa, sonuna bir ek almamışsa ve int türü sınırları içerisindeyse int türdendir. Sayı int türü
	  sınırları dışındaysa error oluşur. 
	  Örnek: 100, 200, 1000000000
	  
	  - Sayı nokta içermiyorsa ve sonuna L (büyük veya küçük) ekini almışsa long türdendir. Sayı long türü sınırları 
	  dışındaysa error oluşur
	  Örneğin: 10L, 4000000000L
	  
	  Anahtar Notlar: Küçük harf L kullanımı 1(bir) rakamına benzemesinden dolayı programlamada tercih edilmez
	  
	  - Java'da byte ve short türden sabitler yoktur
	  
	  - Sayı nokta içeriyorsa ve sonuna bir ek almamışsa double türdendir. Sayı double olarak ifade edilemiyor ise 
	  error oluşur.
	  Örnek:3.4, 6.789
	  
	  - Sayı nokta içersin ya da içermesin sonuna D (büyük ya da küçük) ekini almışsa double türdendir. 
	  Örneğin:
	  3d, 4D, 4.5D
	  
	  - Sayı nokta içersin sonuna F (büyük ya da küçük) ekini almışsa float türdendir.
	  Örneğin:
	  3f, 4.567F
	  
	  - boolean türden iki tane sabit vardır: true, false
	  
	  - char türden sabitler: İki tane tek tırnak karakteri arasında yazılan bir karakter, karakter tablosunda sıra
	  numarası belirtir. Bu şekilde yazılan sabitlere "karakter sabitleri (character literals)" denir ve bu sabitler char 
	  türdendir. İki tane tek tırnak arasında özel durumlar dışında 1(bir)'den fazla karakter yazılması geçersizdir. 
	  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		char c;
		
		c = ' ';
	}
}
