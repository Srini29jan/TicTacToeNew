package com.tdd.kata;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class GameRunnerTest {
    @Test
    public void welcomeMessageShouldBePrintedOnGameStart() {
        String welcomeMessage = "Welcome to TicTacToe 3X3";
        TestableGameRunner testableGameRunner = new TestableGameRunner();

        testableGameRunner.play();

        assertThat(testableGameRunner.getMessage(), Is.is(welcomeMessage));
    }

    private class TestableGameRunner extends GameRunner {

        private String message;

        @Override
        protected void print(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
