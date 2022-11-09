package com.jogatinando.dixit.entities;

import java.util.HashMap;
import java.util.Map;

import com.jogatinando.dixit.utils.CardsProvider;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private String id;
    private Map<String, Player> players;
    private Map<String, Card> cards;
    private Round round;

    public Game(String id){
        this.id = id;
        this.players = new HashMap<String, Player>();
        this.cards = CardsProvider.getCards();
    }

    public void addPlayer(Player player)
    {
        this.players.put(player.getId(), player);
    }
}
