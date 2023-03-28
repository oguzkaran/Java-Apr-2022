/*-----------------------------------------------------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

class App {
    public static void main(String[] args)
    {
        try (Connection con = new Connection("postgresql:jdbc://192.168.1.123:5432/weatherappdb")) {
            con.doWork();
        }
        catch (IllegalStateException ex) {
            Console.writeLine("Illegal State:%s", ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            Console.writeLine("Illegal Argument:%s", ex.getMessage());
        }
        catch (Throwable ignore) {
            //...
        }
    }
}


class Connection implements Closeable {
    private final String m_url;

    public Connection(String url)
    {
        //...
        Random r = new Random();

        if (r.nextBoolean())
            throw new IllegalArgumentException("Url not found");

        m_url = url;
        Console.writeLine("Connected to %s", url);
    }

    public void doWork()
    {
        Random r = new Random();

        //...

        if (r.nextBoolean())
            throw new IllegalStateException(("Illegal operation"));

        Console.writeLine("Working on connection at '%s'", m_url);
    }

    public void close() throws IOException
    {
        Console.writeLine("Connection closed");
    }
}
