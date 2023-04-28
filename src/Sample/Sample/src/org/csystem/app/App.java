/*-----------------------------------------------------------------------------------------------------------------------
    Bir sınıfın içerisinde tüm metotların ve static blokların dışında bildirilen bloklara sınıfın "non-static blokları (non-static initializers)"
    denir. Bu blokları ctor'ların başında çalıştırılır. Yani adeta bu blokların kodları her ctor'un başına gizlice
    yerleştirilmiş olur. non-static bloklar da birden fazla ise bildirim sırasına göre çalıştırılır. non-static bloklar
    içerisinde sınıfın non-static final veri elemanlarına değer verilebilir. non-static bloklar da non-static metotlar
    gibidir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Sample s1 = new Sample();
        Console.writeLine("--------------------------------------------");
        Sample s2 = new Sample(10);
        Console.writeLine("--------------------------------------------");
        Sample s3 = new Sample(10, 3.4);

        //...
    }
}

class Sample {
    {
        Console.writeLine("non-static initializer-1");
    }

    {
        Console.writeLine("non-static initializer-2");
    }

    {
        Console.writeLine("non-static initializer-3");
    }

    public Sample()
    {
        Console.writeLine("I am a default ctor");
    }

    public Sample(int x)
    {
        Console.writeLine("I am a ctor with parameter type int");
    }

    public Sample(int x, double y)
    {
        Console.writeLine("I am a ctor with parameter type int, double");
    }
}