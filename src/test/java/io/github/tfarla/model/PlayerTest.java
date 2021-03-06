package io.github.tfarla.model;

import io.github.tfarla.model.scoreboard.Scoreboard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private String name;
    private Scoreboard board;
    private Player player;

    @Before
    public void setUp() {
        name = "Foo";
        board = new Scoreboard();
        player = new Player(name, board);
    }

    @Test
    public void getName() {
        Assert.assertEquals(name, player.getName());
    }

    @Test
    public void getScoreboard() {
        Assert.assertEquals(board, player.getScoreboard());
    }
}
