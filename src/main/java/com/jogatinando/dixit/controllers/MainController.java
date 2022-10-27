package com.jogatinando.dixit.controllers;

import java.util.ArrayList;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.jogatinando.dixit.entities.Game;
import com.jogatinando.dixit.entities.Player;

@Controller
public class MainController {

    @MessageMapping("/createGame")
    @SendTo("/topic/response")
    public Game createGame(Player player) throws Exception {

        Game game = new Game();
        ArrayList<Player> tempPlayers = new ArrayList<Player>();
        tempPlayers.add(player);
        game.setPlayers(tempPlayers);

        return game;
    }
}
