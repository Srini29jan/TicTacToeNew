package com.tdd.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void checkIfXIsFirstPlayerAfterFirstPlay() {
        Game game = new Game();

        game.playAt(0, 0);

        assertEquals('X', game.getPlayerAt(0, 0));
    }
}
