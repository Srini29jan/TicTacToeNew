package com.tdd.kata;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameRunner {
    private static final Logger logger = Logger.getLogger(GameRunner.class.getName());
    private static final String FIRST_ROW = "1 2 3";
    private static final String POSITION_INFORMATION_MESSAGE = "Position of each box is represented by a number as below";
    private static final String SECOND_ROW = "4 5 6";
    private static final String THIRD_ROW = "7 8 9";
    private static final String WELCOME_MESSAGE = "Welcome to TicTacToe 3X3";
    public static final String CHOOSE_POSITION_INSTRUCTION = "Choose one of these positions on a player's turn";

    public void play() {
        print(WELCOME_MESSAGE);
        print(POSITION_INFORMATION_MESSAGE);
        print(FIRST_ROW);
        print(SECOND_ROW);
        print(THIRD_ROW);
        print(CHOOSE_POSITION_INSTRUCTION);
    }

    protected void print(String message) {
        logger.log(Level.INFO, message);
    }
}
