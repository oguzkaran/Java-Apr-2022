package org.csystem.app.simulation.craps;

import org.csystem.game.craps.Craps;

public class CrapsSimulation {
    private double m_probability;

    public double getProbability()
    {
        return m_probability;
    }

    public void run(int count)
    {
        int winCount = 0;

        for (int i = 0; i < count; ++i) {
            Craps craps = new Craps();

            craps.play();

            if (craps.isWin())
                ++winCount;
        }

        m_probability = (double)winCount / count;
    }
}
