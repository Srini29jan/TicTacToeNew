package com.tdd.kata;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameRunnerTest {
    @Test
    public void welcomeMessageShouldBePrintedOnGameStart() {
        String welcomeMessage = "Welcome to TicTacToe 3X3";
        TestableGameRunner testableGameRunner = new TestableGameRunner();

        testableGameRunner.play();

        String message = testableGameRunner.getMessage();
        assertNotNull(message);
        assertTrue(message.contains(welcomeMessage));
    }

    @Test
    public void positionInformationMessageShouldBePrintedAfterWelcomeMessage() {
        String welcomeMessage = "Welcome to TicTacToe 3X3";
        String positionInformationMessage = "Position of each box is represented by a number as below";
        TestableGameRunner testableGameRunner = new TestableGameRunner();

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
