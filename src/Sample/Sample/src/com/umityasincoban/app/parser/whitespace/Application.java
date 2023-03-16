package com.umityasincoban.app.parser.whitespace;

import com.burakmaral.source.StringSource;
import com.sinanreiskorkmaz.parser.WhitespaceCountParser;
import org.csystem.util.console.Console;

public class Application {
    public static void run()
    {
        try {
            String str = Console.read("Bir yazı giriniz:");
            StringSource ss = new StringSource(str);
            WhitespaceCountParser parser = new WhitespaceCountParser(ss);

            int count = (int)parser.parse();

            Console.writeLine("Count:%d", count);
        }
        catch (Exception ex) {
            Console.writeLine("Message:%s", ex.getMessage());
        }
    }
}
