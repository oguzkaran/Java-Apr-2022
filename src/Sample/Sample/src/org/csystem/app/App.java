/*-----------------------------------------------------------------------------------------------------------------------
     Bazı durumlarda nesne içerisinde bir takım kaynaklar (resources) kullanılıyor olabilir. Bu kaynakların kullanılmaya
     başlanmasına mantıksal olarak "kaynağın açılması (open)" dersek kaynak kullanımı bittiğinde, mantıksal olarak
     "kapatılması (close)" yani artık serbest bırakılması gerekebilir. Java'da nesneler garbage collector tarafından yok
     edildiğinden kullanılan kaynağın geri bırakılması da nesnenin yok edilmesi durumundan  gerçekleşir. Anımsanacağı gibi
     garbage collector'ün ne zaman devreye gireceği belirsizdir. Çünkü örneğin bu kaynağı iş bittikten sonra başka bir nesne
     kullanmak isteyebilir.  Burada kaynak olarak belirtilen bir dosya, bir cihaz, bir resim vb. olabilir. Böylesi bir
     durumda convention olarak Closeable arayüzü kullanılır. Closeable arayüzünün close isimli abstract metodu vardır.
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        A a = new B();
        IX ix;

        ix = (IX)a; //haklı dönüşüm

        System.out.println("Tekrar yapıyor musunuz?");
    }
}


class B extends A {
    //...
}

class A  {
    //...
}

interface IX {
    //...
}