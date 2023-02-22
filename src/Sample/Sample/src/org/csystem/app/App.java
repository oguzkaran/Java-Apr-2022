/*-----------------------------------------------------------------------------------------------------------------------
    throws bildirimi olan bir metodun override edilmesi durumunda override edilen metotta throws listesinde olan exception
    sınıfları kaldırılabilir. Yani örneğin override edilmiş olan hiç throws bildirimi olmayabilir. override edilen
    metotta thrpws listesindeki sınıflar veya onlardan doğrudan ya da dolaylı olarak türetilmiş olan exceprtion sınıfları
    bulunabilir. Aksi durumlarda error oluşur
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class E extends A {
    public void foo() throws TheirException //error
    {
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
    public abstract void foo() throws MyException, YourException;
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