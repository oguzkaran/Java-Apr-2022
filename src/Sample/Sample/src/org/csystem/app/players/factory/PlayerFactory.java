package org.csystem.app.players.factory;

import org.csystem.app.players.Player;

public class PlayerFactory {
    private final String [] m_playersStr;

    public PlayerFactory()
    {
        m_playersStr = new String[] {
                "Adile Çaça:adile:100",
                "Anıl B:anil:200",
                "Aykut Abuhan:aykut:134",
        };
    }

    public Player [] getPlayers()
    {
        Player [] players = new Player[m_playersStr.length];

        for (int i = 0; i < players.length; ++i) {
            String [] playerInfoStr = m_playersStr[i].split("[:]+");

            //...

            players[i] = new Player()
                    .setFullName(playerInfoStr[0])
                    .setName(playerInfoStr[0])
                    .setScore(Integer.parseInt(playerInfoStr[2]))
                    .incScore();
        }


        return players;
    }
}
