/*-----------------------------------------------------------------------------------------------------------------------
    Java 9 ile birlikte arayüzler içerisinde private metotlar yazılabilir. Şüphesiz bu metotların gövdeleri olmalıdır.
    Yani abstract olamazlar. private metotlar için default anahtar sözcüğü kullanılamaz
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Util.print(Integer::sum, 10, 20);
        Util.print((a, b) -> a * b, 10, 20);
        Util.print((a, b) -> 2 * a + b, 10, 20);
    }
}

class Util {
    public static void print(IIntBinaryOperator intBinaryOperator, int a, int b)
    {
        Console.writeLine(intBinaryOperator.applyAsInt(a, b));
    }
}

interface IIntBinaryOperator {
    int applyAsInt(int a, int b);
}



