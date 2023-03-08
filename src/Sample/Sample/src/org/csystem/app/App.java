/*-----------------------------------------------------------------------------------------------------------------------
    Bir sınıf birden fazla arayüzü destekleyebilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class A implements IX, IY {
    //...
}


interface IX {
    //...
}

interface IY {
    //...
}