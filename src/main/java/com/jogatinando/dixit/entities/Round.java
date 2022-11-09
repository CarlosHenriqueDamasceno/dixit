package com.jogatinando.dixit.entities;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Round {
	private int count;
	private String masterId;
	private String tip;
	private Map<String, String> selectedCards; // <playerId, cardId>
	private Map<String, String> votes; // <votantId,votedId>
}
