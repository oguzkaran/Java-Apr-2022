/*-----------------------------------------------------------------------------------------------------------------------
	Sarmalayan Sınıflar (Wrapper Classes): Java'da her temel türe karşılık gelen bir sınıf vardır. Bu sınıflara sarmalayan
	sınıflar denir. Böyle bir tasarımın gerekliliği sınıfları tanıdıkça anlaşılacaktır. Bu sınıflarda sarmalamanın dışında
	ilgili türe ilişkin bazı yararlı işlemlerinde yapılabildiği metotlar vardır. Örneğin Integer sınıfının parseInt
	metodu bir yazıdan int türden değer elde etmek için kullanılır. Temel türlere ilişkin sarmalayan sınıflar
	şunlardır:


	Temel Tür                           Sarmalayan Sınıf
	----------------------------------------------------
	short                                   Short
	int                                     Integer
	long                                    Long
	byte                                    Byte
	double                                  Double
	float                                   Float
	char                                    Character
	boolean                                 Boolean

    Bu sınıfların temel özellikleri şunlardır:
    - Bu sınıflardan tamsayı ve gerçek sayı türlerine ilişkin olanları (Short, Integer, Long, Byte, Float ve Double)
    java.lang paketi içerisindeki Number sınıfından türetilmiştir. Bu sebeple bu türlere "nümerik sarmalayan sınıflar" da
    denebilir.
    - Bu sınıfların hepsi java.lang paketinde bildirilmiştir
    - Sarmalayan sınıfların hepsi immutable'dır
    - Bu sınıflar temel türden değerlerin heap'de tutulması için kullanılır. Bu kavrama "kutulama (boxing)" denir. Bu konu
    ileride ele alınacaktır
    - Java 9 ile birlikte sarmalayan sınıfların ctor'ları deprecated olmuştur. Hatta ileride olmayacakları belirtilmiştir. Zaten
    Java 5'den itibaren ctor'ların kullanılması iyi bir teknik değildir, artık deprecated olduğundan kullanılması hiç
    düşünülmemelidir. Bunun nedeni ileride anlaşılacaktır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        RandomAFactory factory = new RandomAFactory();
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        while (count-- > 0) {
            A x = factory.getRandomA();

            System.out.println(x.getClass().getName());
            if (x instanceof B y) {
                //...
                System.out.println("Haklı dönüşüm");
            }
            else
                System.out.println("Haksız dönüşüm");

            System.out.println("------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class RandomAFactory {
    private final Random m_random = new Random();

    public A getRandomA()
    {
        int val = m_random.nextInt(5);

        return switch (val) {
            case 0 -> new A();
            case 1 -> new B();
            case 3 -> new C();
            case 4 -> new D();
            default -> new E();
        };
    }
}

class E extends C {
    //...
}

class D extends A {
    //...
}

class C extends B {
    //...
}

class B extends A {
    //...
}

class A {
    //...
}