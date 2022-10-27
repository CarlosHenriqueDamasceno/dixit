package com.jogatinando.dixit.entities;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private String id;
    private ArrayList<Player> players;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
