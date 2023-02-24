/*-----------------------------------------------------------------------------------------------------------------------
    JavaSE'de bulunan önemli bazı exception sınıfları:
    ClassCastException: Downcasting işleminde haksız dönüşüm olduğunda ClassCastException nesnesi fırlatılır. Haksız dönşüm
    kontrolü için bu exception handle edilebilir. Ancak bunun yerine instanceof operatörü kullanımı tavsiye edilir.

    IllegalArgumentException: Bir metodun parametresinin geçersizliği durumunda fırlatılan exception sınıfıdır. Konuya
    özgü olarak bu sınıftan türemiş exception sınıfları bulunmaktadır.

    NumberFormatException: IllegalArgumentException sınıfından türetilmiştir. Sarmalayan sınıfların parseXXX metotları
    (Boolean sınıfı hariç) yazıyı ilgili türe çeviremelerse bu exception sınıfını fırlatırlar.

    InputMismatchException: Bu sınıf bir girdinin geçersiz olduğu durumlarda fırlatılır. Scanner sınıfının çeşitli
    metotları bu exception'ı fırlatmaktadır

    IndexOutOfBoundsException: Bu exception sınıfı indeks taşmalarında kullanılır. Örneğin ArrayList sınıfının bazı
    metotları bu exception sınıfını fırlatırlar.

    ArrayIndexOutOfBoundsException: Bu exception sınıfı özel olarak dizinin indeks numarasının geçersiz olduğu
    durumlarda kullanılır.

    NullPointerException: Bir referansın null değeri tutması durumunda o referans ile işlem yapılmaya çalışıldığında
    fırlatılır. Bu exception sınıfının programlamada handle edilmesi tavsiye edilmez. Genel olarak bu durumun oluşabileceği
    kod parçaları yazılmamalıdır ya da yazılmışsa düzeltilmelidir

    Anahtar Notlar: Yukarıdakilerin dışında bir çok yararlı exception sınıfı JavaSE'de bulunmaktadır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class Sample {
    public static void bar() throws TheirException
    {
        //...
    }
}

class E extends A {
    public void foo() throws TheirException
    {
        Sample.bar();
        //...
    }
}

class D extends A {
    public void foo() throws OurException
    {
        //...
    }
}

class C extends A {
    public void foo() throws MyException
    {
        //...
    }
}

class B extends A {
    public void foo()
    {
        //...
    }
}

abstract class A {
    public abstract void foo() throws Exception;
    //...
}

class MyException extends Exception {
    //...
}

class YourException extends Exception {
    //...
}

class OurException extends MyException {
    //...
}

class TheirException extends Exception {
    //...
}