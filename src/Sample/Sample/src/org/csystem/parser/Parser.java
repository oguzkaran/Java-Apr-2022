package org.csystem.parser;

public abstract class Parser implements IParser {
    protected ISource source;

    protected Parser(ISource source)
    {
        this.source = source;
    }
}
