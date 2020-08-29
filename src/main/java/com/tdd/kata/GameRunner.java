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
    private static final String CHOOSE_POSITION_INSTRUCTION = "Choose one of these positions on a player's turn";
    private static final String STARTING_PLAYER_INFORMATION = "Game always starts with player 'X'";
    private static final String MARK_YOUR_POSITION_INSTRUCTION = "Mark your position:";

    public void play() {
        printInitialInstructions();
    }

    private void printInitialInstructions() {
        print(WELCOME_MESSAGE);
        print(POSITION_INFORMATION_MESSAGE);
        print(FIRST_ROW);
        print(SECOND_ROW);
        print(THIRD_ROW);
        print(CHOOSE_POSITION_INSTRUCTION);
        print(STARTING_PLAYER_INFORMATION);
        print(MARK_YOUR_POSITION_INSTRUCTION);
    }

    protected void print(String message) {
        logger.log(Level.INFO, message);
    }
}
