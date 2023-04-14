/*-----------------------------------------------------------------------------------------------------------------------
    Generic bir arayüzün herhngi bir açılımını implemente eden bir sınıf içerisinde arayüzün metotları açılıma uygun şekilde
    override edilmelidir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        Sample s = new Sample();
        Mample m = new Mample();

        s.foo("ankara");
        m.foo(true);
    }
}

class Mample implements IX<Boolean> {
    public void foo(Boolean b)
    {
        System.out.println(b);
    }

}

class Sample implements IX<String> {
    public void foo(String s)
    {
        System.out.println(s);
    }
}

interface IX<T> {
    void foo(T t);
}