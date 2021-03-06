package io.github.tfarla.model;

import io.github.tfarla.model.scoreboard.Scoreboard;

public class Player {
    private String name;
    private Scoreboard board;

    public Player(String name, Scoreboard board) {
        this.name = name;
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public Scoreboard getScoreboard() {
        return board;
    }
}
