package org.csystem.game.test;

import org.csystem.game.card.Card;

public class CardShuffleTest {
    public static void run()
    {
        Card[] deck;

        deck = Card.getShuffledDeck();

        for (Card c : deck)
            System.out.println(c.toString());
    }
}
