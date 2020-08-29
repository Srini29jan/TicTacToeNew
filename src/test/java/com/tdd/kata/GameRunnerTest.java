package com.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameRunnerTest {

    private static final String POSITION_INFORMATION_MESSAGE = "Position of each box is represented by a number as below";
    private static final String WELCOME_MESSAGE = "Welcome to TicTacToe 3X3";
    private TestableGameRunner testableGameRunner;

    @Before
    public void setUp() {
        testableGameRunner = new TestableGameRunner();
    }

    @Test
    public void welcomeMessageShouldBePrintedOnGameStart() {
        String welcomeMessage = WELCOME_MESSAGE;

        testableGameRunner.play();

        String message = testableGameRunner.getMessage();
        assertNotNull(message);
        assertTrue(message.contains(welcomeMessage));
    }

    @Test
    public void positionInformationMessageShouldBePrintedAfterWelcomeMessage() {
        String welcomeMessage = WELCOME_MESSAGE;
        String positionInformationMessage = POSITION_INFORMATION_MESSAGE;

        testableGameRunner.play();

        String message = testableGameRunner.getMessage();
        assertNotNull(message);
        assertTrue(message.indexOf(positionInformationMessage) > message.indexOf(welcomeMessage));
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
