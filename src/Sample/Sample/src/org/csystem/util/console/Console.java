/*------------------------------------------------------------------
	FILE		: Console.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 28.04.2023

	Utility Console class for standard input (stdin) and
	standard output (stdout)

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB;

    static {
        KB = new Scanner(System.in);
    }
    private Console()
    {
    }

    // Methods for int value
    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String prompt)
    {
        return readInt(prompt, "");
    }

    public static int readInt(String prompt, String errorPrompt)
    {
        for (;;) {
            try {
                System.out.print(prompt);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static int readIntLine(String prompt)
    {
        return readInt(prompt + "\n");
    }

    public static int readIntLine(String prompt, String errorPrompt)
    {
        return readInt(prompt + "\n", errorPrompt + "\n");
    }

    // Methods for double value
    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String prompt)
    {
        return readDouble(prompt, "");
    }

    public static double readDouble(String prompt, String errorPrompt)
    {
        for (;;) {
            try {
                System.out.print(prompt);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static double readDoubleLine(String prompt)
    {
        return readDouble(prompt + "\n");
    }

    public static double readDoubleLine(String prompt, String errorPrompt)
    {
        return readInt(prompt + "\n", errorPrompt + "\n");
    }

    // Methods for long value
    public static long readLong()
    {
        return readLong("");
    }

    public static long readLong(String prompt)
    {
        return readLong(prompt, "");
    }

    public static long readLong(String prompt, String errorPrompt)
    {
        for (;;) {
            try {
                System.out.print(prompt);

                return Long.parseLong(KB.nextLine());
            }
            catch (NumberFormatException ignore) {
                System.out.print(errorPrompt);
            }
        }
    }

    public static long readLongLine(String prompt)
    {
        return readLong(prompt + "\n");
    }

    public static long readLongLine(String prompt, String errorPrompt)
    {
        return readLong(prompt + "\n", errorPrompt + "\n");
    }

    // Methods for char value
    public static char readChar()
    {
        return readChar("");
    }

    public static char readChar(String prompt)
    {
        return readChar(prompt, "");
    }

    public static char readChar(String prompt, String errorPrompt)
    {
        String str;

        for (;;) {
            str = read(prompt);
            if (str.length() == 1)
                break;

            System.out.println(errorPrompt);
        }

        return str.charAt(0);
    }

    public static char readCharLine(String prompt)
    {
        return readChar(prompt + "\n");
    }

    public static char readCharLine(String prompt, String errorPrompt)
    {
        return readChar(prompt + "\n", errorPrompt + "\n");
    }

    //Methods for String input
    public static String read()
    {
        return read("");
    }

    public static String read(String prompt)
    {
        write(prompt);

        return KB.nextLine();
    }

    public static String readLine(String prompt)
    {
        return read(prompt + "\n");
    }

    //Methods for stdout
    public static void write(Object object)
    {
        write("%s", object);
    }

    public static void write(String fmt, Object...objects)
    {
        System.out.printf(fmt, objects);
    }

    public static void writeLine(String fmt, Object...objects)
    {
        write(fmt + "\n", objects);
    }

    public static void writeLine()
    {
        System.out.println();
    }

    public static void writeLine(Object object)
    {
        writeLine("%s", object);
    }

    //...
}
