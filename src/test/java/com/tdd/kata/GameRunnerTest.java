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
        assertTrue(message.contains("1 2 3"));
        assertTrue(message.indexOf("1 2 3") > message.indexOf(POSITION_INFORMATION_MESSAGE));
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
