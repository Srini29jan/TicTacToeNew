package com.tdd.kata;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class GameTest {

    private static final int POSITION_ZERO = 0;
    private static final char PLAYER_X = 'X';

    @Test
    public void checkIfXIsFirstPlayerAfterFirstPlay() {
        Game game = new Game();

        game.playAt(POSITION_ZERO, POSITION_ZERO);

        assertThat(game.getPlayerAt(POSITION_ZERO, POSITION_ZERO), Is.is(PLAYER_X));
    }
}
