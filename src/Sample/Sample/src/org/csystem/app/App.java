/*-----------------------------------------------------------------------------------------------------------------------
    Console sınıfı ve test kodu
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        char ch = Console.readChar("Bir karakter giriniz:", "Hatalı giriş yaptınız!...");

        Console.writeLine("ch = %c", ch);
    }
}

