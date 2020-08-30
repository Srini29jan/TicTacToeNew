package com.tdd.kata;

import java.util.Scanner;
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
    private static final String LINE_BREAK = "\n";
    private final Scanner scanner;

    public GameRunner() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new GameRunner().play();
    }

    public void play() {
        printInitialInstructions();
        Game game = newGame();
        int position = scanner.nextInt();
        game.playAt(position);
    }

    protected Game newGame() {
        return new Game();
    }

    private void printInitialInstructions() {
        StringBuilder initialInstructionsBuilder = new StringBuilder(WELCOME_MESSAGE).append(LINE_BREAK)
                .append(POSITION_INFORMATION_MESSAGE).append(LINE_BREAK)
                .append(FIRST_ROW).append(LINE_BREAK)
                .append(SECOND_ROW).append(LINE_BREAK)
                .append(THIRD_ROW).append(LINE_BREAK)
                .append(CHOOSE_POSITION_INSTRUCTION).append(LINE_BREAK)
                .append(STARTING_PLAYER_INFORMATION).append(LINE_BREAK)
                .append(MARK_YOUR_POSITION_INSTRUCTION);
        print(initialInstructionsBuilder.toString());
    }

    protected void print(String message) {
        logger.log(Level.INFO, message);
    }
}
