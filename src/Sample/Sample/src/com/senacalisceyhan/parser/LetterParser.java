package com.senacalisceyhan.parser;

import org.csystem.parser.ISource;
import org.csystem.parser.Parser;

public class LetterParser extends Parser {
    private final String m_prefix;
    private final String m_suffix;
    public LetterParser(ISource source, String prefix, String suffix)
    {
        super(source);
        m_prefix = prefix;
        m_suffix = suffix;
    }

    public Object parse()
    {
        String result = m_prefix;

        try {
            int ch;

            while ((ch = source.nextChar()) != -1)
                if (Character.isLetter(ch))
                    result += (char)ch;

            result += m_suffix;
        }
        catch (Exception ignore) {
            result = "";
        }

        return result;
    }
}
