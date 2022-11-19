package org.csystem.util.datetime.test;

import org.csystem.util.datetime.Time;

public class TimeValidationTest2 {
    public static void run()
    {
        Time time = new Time();

        System.out.println(time.toLongTimeString());

        time.setHour(24);
    }
}

