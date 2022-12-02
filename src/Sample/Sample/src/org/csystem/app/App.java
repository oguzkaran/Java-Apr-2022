/*-----------------------------------------------------------------------------------------------------------------------
    Biz gerekmedikçe veri elemanları için this referansını kullanmayacağız. Ancak bazı programcılar metot çağrılarında
    okunabilirlik açısından this referansını kullanırlar. Çüğnkü non-static bir metodu this ile çağırmak static bir metot
    çağrısının okunabilirliğini yani onun static bir metot olduğunun anlaşılmasını sağlar
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.setA(20);
        s.print();
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //...
}