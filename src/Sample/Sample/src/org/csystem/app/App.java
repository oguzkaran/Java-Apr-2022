/*-----------------------------------------------------------------------------------------------------------------------
    Java'da exception sınıfları kategori olarak iki gruba ayrılır: checked, unchecked
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        try {
            Application.run();
        }
        catch (WrapperException ex) {
            Console.writeLine("Message:%s", ex.getMessage());
            Throwable cause = ex.getCause();
            if (cause != null)
                Console.writeLine("Cause Excption Message:%s", cause.getMessage());
        }

        Console.writeLine("Tekrar yapıyor musunuz?");
    }
}

class Application {
    public static void run()
    {
        try {
            double val = Console.readDouble("Bir sayı giriniz:", "Hatalı giriş yaptınız!...");

            Console.writeLine("log(%.2f) = %f", val, MathUtil.log(val));
        }
        catch (NegativeInfinityException ex) {
            //...
            throw new WrapperException("Application.run: NegativeInfinityException", ex);
        }
        catch (NaNException ignore) {
            throw new WrapperException("Application.run: NaNException");
        }
    }
}

class WrapperException extends RuntimeException {
    public WrapperException(String message)
    {
        this(message, null);
    }

    public WrapperException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public String getMessage()
    {
        Throwable cause = getCause();

        return String.format("Message:%s%s", super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
    }
}



class MathUtil {
    public static double log(double a)
    {
        if (a == 0)
            throw new NegativeInfinityException("Undefined");

        if (a < 0)
            throw new NaNException("Indeterminate");

        return Math.log(a);
    }
}

class NegativeInfinityException extends MathException {
    public NegativeInfinityException(String message)
    {
        super(message, MathExceptionStatus.NEGATIVE_INFINITY);
    }

    public String getMessage()
    {
        return String.format("Message:%s, Status:%s", super.getMessage(), getMathExceptionStatus());
    }
}

class NaNException extends MathException {
    public NaNException(String message)
    {
        super(message, MathExceptionStatus.NAN);
    }

    public String getMessage()
    {
        return String.format("Message:%s, Status:%s", super.getMessage(), getMathExceptionStatus());
    }
}

enum MathExceptionStatus {ZERO, POSITIVE_INFINITY, NEGATIVE_INFINITY, POSITIVE_ZERO, NEGATIVE_ZERO, NAN,}

class MathException extends RuntimeException {
    private final MathExceptionStatus m_mathExceptionStatus;
    public MathException(String message, MathExceptionStatus mathExceptionStatus)
    {
        super(message);
        m_mathExceptionStatus = mathExceptionStatus;
    }

    public MathExceptionStatus getMathExceptionStatus()
    {
        return m_mathExceptionStatus;
    }
}

