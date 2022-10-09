package org.csystem.game.craps;

import java.util.Random;

public class Craps {
    private boolean m_win;

    private static int roll(Random r)
    {
        return r.nextInt(1, 7) + r.nextInt(1, 7);
    }

    private void rollForIndeterminate(Random r, int result)
    {
        int total;

        while ((total = roll(r)) != result && total != 7)
            ;

        m_win = total == result;
    }

    public boolean isWin()
    {
        return m_win;
    }

    public void play()
    {
        Random r = new Random();

        int total = roll(r);

        switch (total) {
            case 7, 11 -> m_win = true;
            case 2, 3, 12 -> m_win = false;
            default -> rollForIndeterminate(r, total);
        }
    }
}