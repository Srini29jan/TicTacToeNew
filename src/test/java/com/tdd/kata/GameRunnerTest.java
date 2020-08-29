package com.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameRunnerTest {

    private static final String CHOOSE_POSITION_INSTRUCTION = "Choose one of these positions on a player's turn";
    private static final String FIRST_ROW = "1 2 3";
    private static final String POSITION_INFORMATION_MESSAGE = "Position of each box is represented by a number as below";
    private static final String SECOND_ROW = "4 5 6";
    private static final String THIRD_ROW = "7 8 9";
    private static final String WELCOME_MESSAGE = "Welcome to TicTacToe 3X3";
    private static final String STARTING_PLAYER_INFORMATION = "Game always starts with player 'X'";
    private TestableGameRunner testableGameRunner;

    @Before
    public void setUp() {
        testableGameRunner = new TestableGameRunner();
    }

    @Test
    public void welcomeMessageShouldBePrintedOnGameStart() {
        testableGameRunner.play();

        String message = testableGameRunner.getMessage();
        assertNotNull(message);
        assertTrue(message.contains(WELCOME_MESSAGE));
    }

    @Test
    public void positionInformationMessageShouldBePrintedAfterWelcomeMessage() {
        testableGameRunner.play();

        String message = testableGameRunner.getMessage();
        assertNotNull(message);
        assertTrue(message.indexOf(POSITION_INFORMATION_MESSAGE) > message.indexOf(WELCOME_MESSAGE));
    }

    @Test
    public void firstRowInformationMessageShouldBePrintedAfterPositionInformationMessage() {
        testableGameRunner.play();
        String message = testableGameRunner.getMessage();

        assertNotNull(message);
        assertTrue(message.contains(FIRST_ROW));
        assertTrue(message.indexOf(FIRST_ROW) > message.indexOf(POSITION_INFORMATION_MESSAGE));
    }

    @Test
    public void secondRowInformationMessageShouldBePrintedAfterFirstRowInformationMessage() {
        testableGameRunner.play();
        String message = testableGameRunner.getMessage();

        assertNotNull(message);
        assertTrue(message.contains(SECOND_ROW));
        assertTrue(message.indexOf(SECOND_ROW) > message.indexOf(FIRST_ROW));
    }

    @Test
    public void thirdRowInformationMessageShouldBePrintedAfterSecondRowInformationMessage() {
        testableGameRunner.play();
        String message = testableGameRunner.getMessage();

        assertNotNull(message);
        assertTrue(message.contains(THIRD_ROW));
        assertTrue(message.indexOf(THIRD_ROW) > message.indexOf(SECOND_ROW));
    }

    @Test
    public void choosePositionInstructionShouldBePrintedAfterThirdRowInformationMessage() {
        testableGameRunner.play();
        String message = testableGameRunner.getMessage();

        assertNotNull(message);
        assertTrue(message.contains(CHOOSE_POSITION_INSTRUCTION));
        assertTrue(message.indexOf(CHOOSE_POSITION_INSTRUCTION) > message.indexOf(THIRD_ROW));
    }

    @Test
    public void startingPlayerInformationShouldBePrintedAfterChoosePositionInstruction() {
        testableGameRunner.play();
        String message = testableGameRunner.getMessage();

        assertNotNull(message);
        assertTrue(message.contains(STARTING_PLAYER_INFORMATION));
        assertTrue(message.indexOf(STARTING_PLAYER_INFORMATION) > message.indexOf(CHOOSE_POSITION_INSTRUCTION));
    }

    private class TestableGameRunner extends GameRunner {

        private final StringBuilder message = new StringBuilder();

        @Override
        protected void print(String message) {
            this.message.append(message);
        }

        public String getMessage() {
            return message.toString();
        }
    }
}
