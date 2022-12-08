package org.csystem.app.players;

public class Player {
    private String m_fullName;
    private String m_name;

    private int m_score;

    public String getFullName()
    {
        return m_fullName;
    }

    public Player setFullName(String fullName)
    {
        //...
        m_fullName = fullName;

        return this;
    }

    public String getName()
    {
        return m_name;
    }

    public Player setName(String name)
    {
        //...
        m_name = name;

        return this;
    }

    public int getScore()
    {
        return m_score;
    }

    public Player setScore(int score)
    {
        //...
        m_score = score;

        return this;
    }

    public Player incScore()
    {
        ++m_score;

        return this;
    }

    public String toString()
    {
        return String.format("[%s]%s %d", m_name, m_fullName, m_score);
    }
}
