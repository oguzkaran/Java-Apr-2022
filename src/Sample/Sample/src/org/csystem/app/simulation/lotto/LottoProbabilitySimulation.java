package org.csystem.app.simulation.lotto;

public class LottoProbabilitySimulation {
    private double m_game1Prob;
    private double m_game2Prob;
    private double m_game3Prob;

    public double getGame1Prob()
    {
        return m_game1Prob;
    }

    public double getGame2Prob()
    {
        return m_game2Prob;
    }

    public double getGame3Prob()
    {
        return m_game3Prob;
    }

    public void run(int count)
    {
        java.util.Random r = new java.util.Random();

        int winCount1,  winCount2,  winCount3;

        winCount1 = winCount2 = winCount3 = 0;

        for (int i = 0; i < count; ++i) {
            Lotto lotto = new Lotto(r);

            lotto.play();

            if (lotto.isWinGame1())
                ++winCount1;
            if (lotto.isWinGame2())
                ++winCount2;
            if (lotto.isWinGame3())
                ++winCount3;
        }

        m_game1Prob = (double)winCount1 / count;
        m_game2Prob = (double)winCount2 / count;
        m_game3Prob = (double)winCount3 / count;
    }

}
