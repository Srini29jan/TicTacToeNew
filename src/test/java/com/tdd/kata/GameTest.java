package com.tdd.kata;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class GameTest {

    private static final int POSITION_ONE = 1;
    private static final int POSITION_TWO = 2;
    private static final int POSITION_ZERO = 0;
    private static final char PLAYER_O = 'O';
    private static final char PLAYER_X = 'X';
    private Game game;

    @Before
    public void initializeGame() {
        game = new Game();
    }

    @Test
    public void checkIfXIsFirstPlayerAfterFirstPlay() {
        game.playAt(POSITION_ZERO, POSITION_ZERO);

        assertThat(game.getPlayerAt(POSITION_ZERO, POSITION_ZERO), Is.is(PLAYER_X));
    }

    @Test
    public void checkIfOIsSecondPlayerAfterSecondPlay() {
        game.playAt(POSITION_ZERO, POSITION_ZERO);
        game.playAt(POSITION_ZERO, POSITION_ONE);

        assertThat(game.getPlayerAt(POSITION_ZERO, POSITION_ONE), Is.is(PLAYER_O));
    }

    @Test
    public void checkIfXWinsIfXFillsFirstRow() {
        game.playAt(POSITION_ZERO, POSITION_ZERO);
        game.playAt(POSITION_ONE, POSITION_ZERO);
        game.playAt(POSITION_ZERO, POSITION_ONE);
        game.playAt(POSITION_ONE, POSITION_ONE);
        game.playAt(POSITION_ZERO, POSITION_TWO);

        assertThat(game.getWinner(), Is.is(PLAYER_X));
    }
}
