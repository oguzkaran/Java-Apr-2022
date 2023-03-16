package com.mehmetyildirim.app.parser.letter;

import com.ezgiakat.source.CharArraySource;
import com.senacalisceyhan.parser.LetterParser;
import org.csystem.util.console.Console;

public class Application {
    public static void run()
    {
        try {
            String str = Console.read("Bir yazı giriniz:");
            CharArraySource ss = new CharArraySource(str);
            LetterParser parser = new LetterParser(ss, "[", "]");
            String letters = (String)parser.parse();

            Console.writeLine("Letter:%s", letters);
        }
        catch (Exception ex) {
            Console.writeLine("Message:%s", ex.getMessage());
        }
    }
}
