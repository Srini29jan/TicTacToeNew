package com.tdd.kata;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameRunner {
    private static final Logger logger = Logger.getLogger(GameRunner.class.getName());
    private static final String POSITION_INFORMATION_MESSAGE = "Position of each box is represented by a number as below";
    private static final String WELCOME_MESSAGE = "Welcome to TicTacToe 3X3";

    public void play() {
        print(WELCOME_MESSAGE);
        print(POSITION_INFORMATION_MESSAGE);
    }

    protected void print(String message) {
        logger.log(Level.INFO, message);
    }
}