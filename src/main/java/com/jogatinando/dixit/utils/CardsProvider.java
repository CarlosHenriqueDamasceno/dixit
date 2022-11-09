package com.jogatinando.dixit.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.jogatinando.dixit.entities.Card;

public class CardsProvider
{
    public static Map<String, Card> getCards()
    {
        HashMap<String, Card> cards = new HashMap<String, Card>();
        String id = UUID.randomUUID().toString();
        cards.put(
            id,
            new Card(
                id,
               "images/cards/teste.png"
            )
        );
        return cards;
    }
}
