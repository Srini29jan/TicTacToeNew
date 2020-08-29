package com.tdd.kata;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameRunner {
    private static final Logger logger = Logger.getLogger(GameRunner.class.getName());

    public void play() {
        print("Welcome to TicTacToe 3X3");
        print("Position of each box is represented by a number as below");
    }

    protected void print(String message) {
        logger.log(Level.INFO, message);
    }
}
