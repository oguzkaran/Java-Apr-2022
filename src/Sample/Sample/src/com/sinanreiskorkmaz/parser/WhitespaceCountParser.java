package com.sinanreiskorkmaz.parser;

import org.csystem.parser.ISource;
import org.csystem.parser.Parser;

public class WhitespaceCountParser extends Parser {
    //...
    public WhitespaceCountParser(ISource source)
    {
        super(source);
    }

    public Object parse() throws Exception
    {
        int count = 0;
        int ch;

        while ((ch = source.nextChar()) != -1)
            if (Character.isWhitespace(ch))
                ++count;

        return count;
    }
}
