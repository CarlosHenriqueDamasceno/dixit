package com.jogatinando.dixit.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpAttributesContextHolder;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.jogatinando.dixit.entities.Game;
import com.jogatinando.dixit.entities.Player;
import com.jogatinando.dixit.utils.TextManipulationHelper;

@Controller
public class MainController {

	@MessageMapping("/create-game")
	@SendTo("/topic/game-state")
	public Game createGame(String playerName, SimpMessageHeaderAccessor accessor) throws Exception {
		Player firstPlayer = new Player(
			UUID.randomUUID().toString(),
			playerName,
			TextManipulationHelper.getNameInitials(playerName)
		);
		Game game = new Game(UUID.randomUUID().toString());
		game.addPlayer(firstPlayer);
		String sessionId = SimpAttributesContextHolder.currentAttributes().getSessionId();
		System.out.println(sessionId);
		return game;
	}
}
