package com.jogatinando.dixit.entities;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
	private final String id;
	private String nick;
	private String initials;
	private int score;
	private Map<String, Card> deck;
	private String sessionId;

	public Player(String id, String nick, String initials)
	{
		this.id = id;
		this.nick = nick;
		this.initials = initials;
		this.score = 0;
		this.deck = new HashMap<String, Card>();
	}
}

