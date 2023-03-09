/*-----------------------------------------------------------------------------------------------------------------------
    (abstract) sınıflar ile arayüzler arasındaki farklar: (Maddlerin sırasının önemi yoktur)
    - Arayüzler interface anahtar sözcüğü ile abstract sınıflar ise class anahtar sözcüğü ile bildirilir

    - Arayüzler non-static veri elemanlarına sahip olamaz, abstract sınıflar olabilir

    - Arayüzler nesne özelliği göstermediğinden cTor'ları olamaz, abstract sınıfların olabilir

    - Arayüzlerin abstarct metotları yazılsa da yazılmasa da public ve abstract olarak bildirilmiş olur, abstract sınıflar
    için erişim belirleyici ve abstract anahtar sözcüğü bildirimde yazılmalıdır

    - Arayüzlere Java 8 ile birlikte eklenen gövdeli non-static metotlar default anahtar sözcüğü ile bildirilmelidir.
    abstract sınıfldar da dorğudan erişim belirleyici ile yazılabilir.

    - Arayüzlerin default metotları public'dir, abstract sınıfların abstract olmayan metotları public olarak bildirilmek
    zorunda değildir

    - Bir sınıf bir arayüzü implements anahtar sözcüğüile destekler (implementation), abstract sınıftan ise extends anahtar
    sözcüğü ile türetme yapılabilir. Burada arayüzler için türetme (extensiion/inheritance) teriminin kullanılmadığına
    dikkat ediniz

    - Bir sınıf istediği kadar arayüzü destekler ancak tek bir sınıftan türetilebilir

    - Arayüzler arasında çoklu türeme yapılabilir ancak sınıflar ararında yapılamaz

    - Arayüzler türünde hiç bir şekilde nesne yaratılamaz, abstract sınıf türünden ensne türemiş sınıf nesnesi içerisinde
    otomatik olarak yaratılır

    - Bir sınıfın en az bir tane abstract metodu varsa sınıf da abstract olarak bildirilmelidir. Bir arayüz abstratc olarak
    bildirilebilse de, bildirilmemesiyle aynı anlamdadır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        A a = new A();
        IX ix = a;
        B b = a;

        ix.foo();
        b.foo();
    }
}

class A extends B implements IX {
    public void foo()
    {
        Console.writeLine("A.foo");
        super.foo();
    }
}

class B {
    public void foo()
    {
        Console.writeLine("B.foo");
    }
}
interface IX {
    default void foo()
    {
        Console.writeLine("IX.foo");
    }
}

