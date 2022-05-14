/*----------------------------------------------------------------------------------------------------------------------
	Hello, World programının genel olarak açıklanması. Burada yapılan açıklamalar tamamen genel olacaktır. Detaylar 
	ileride ele alınacaktır:
	
	Bir Java programı genel olarak paketlerden, paketler sınıflardan, sınıflar da metotlardan oluşur.
	
	paket bildiriminin genel biçimi:
	
	package <isim>;	
	Örneğin:
	package csd;
	
	Paketler konusu ileride detaylı olarak ele alınacaktır. Paketler konusuna kadar sadece csd paketi altında çalışacağız.
	
	Sınıf bildiriminin genel biçimi:
	
	class <isim> {
		//...
	}
	
	Örneğin:
	class App {
		//...
	}
	
	class Sample {
		//...
	}
	
	class Mample {
		//...
	}
	
	Sınıflar konusunun detayları zaman içerisinde anlaşılacaktır.
	
	Java'da alt programlara "metot (method)" denir. Alt programın ne yapacağının yazılmasına "metot bildirimi (method declaration)"
	Alt programın kodlarının çalıştırılmasına ise "metot çağırma (method call)" denir. Metot bildiriminin genel biçimi:
	
	[erişim belirleyici] [static] <geri dönüş değeri bilgisi> <metot ismi>([parametreler])
	{
		//...
	}
	
	Açıklamalar:
	- Erişim belirleyici şunlardan biri olabilir: public, protected, no-modifier (hiç bir şey yazılmaması), private
	Metotların erişim belirleyicilerine ilişkin konuya gelene kadar tüm metotlar public olarak bildirilecektir
	
	- Bir metot "static" veya "non-static" olabilir. İlgili konuya gelene kadar tüm metotlar static olarak bildirilecektir.
	
	- Erişim belirleyici anahtar sözcük ile static anahtar sözcüğü aynı sentaks seviyesinde olduğundan yerleri değiştirilebilir.
	Ancak okunabilirlik/algılanabilirlik açısından biz erişimm belirleyiciyi önce yazacağız
	
	- Metoun geri dönüş değeri bilgisi metot isminden önce yazılmalıdır ve kesinlikle yazılmalıdır. Metodun geri dönüş
	değerinin olmaması durumunda buraya "void" anahtar sözcüğü yazılmalıdır. 
	
	- Metodun ismi değişken atomdur. Tüm değişken atomlarda olduğu gibi "değişken isimlendirme kuralları"'na uygun
	olarak isimlendirilmeldir
	
	- Metot bildiriminde metot isminden sonra parantezler içerisinde ismine "parametre (parameter)" denmilen değişkenler
	bildirilebilir. Metodun parametre değişkenleri olmayabilir. Bu durumda parantezler arasına hiç bir şey yazılmaz
	
	- Metot bildiriminde küme parantezleri arasında ("metot gövdesi (method body)") metodun kodları yazılır 
	
	static bir metodun çağrılamasının genel biçimi:
	
	[paket ismi].[sınıf ismi].<metot ismi>([argümanlar]);
	
	Bir program main metodunun çağrılmasıyla çalışmaya başlar. Programcının main metodu içerisinde çağırdığı ve metotlar
	ve o metotlar içerisinde çağrılan metotlar ile akış devam eder. main metodu JVM tarafından çağrılır. Bu anlamda "java"
	programına verilen "byte code"'a ilişkin sınıfın main metoduna "giriş noktası (entry point)" denir. Özel bazı
	durumlar dışında (bu özel durumlar uygulama kurslarında ele alınacaktır) main metodu sonlandığında program sonlanır.
	Bir metot çağrıldığında akış metodun kodlarına dallanır (call) ve metodun kodları çalıştırılır. Şüphesiz metot
	içerisinde de başka bir metot çağrılıyor olabilir. Yine bu çağırma noktasında akış çağrılan metodun kodlarına
	dallanır. Metot çağrısı sonlandığınhda akış metodun çağrıldığı noktaya geri döner ve bir sonraki akış çalışmaya
	devam eder 
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
		csd.Sample.foo();
		csd.Sample.bar();
		System.out.println("Goodbye, World");
	}
}

class Sample {
	public static void foo()
	{
		System.out.println("foo");
		csd.Mample.tar();
	}
	
	public static void bar()
	{
		System.out.println("bar");
	}
}

class Mample {
	public static void tar()
	{
		System.out.println("tar");
	}
}



