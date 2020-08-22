package com.tdd.kata;

public class Game {

    private static final int GRID_SIZE = 3;
    private static final int POSITION_ONE = 1;
    private static final int POSITION_TWO = 2;
    private static final int POSITION_ZERO = 0;
    private static final char PLAYER_O = 'O';
    private static final char PLAYER_X = 'X';
    private final char[][] board = new char[GRID_SIZE][GRID_SIZE];
    private char previousPlayer;

    public char getPlayerAt(int row, int column) {
        return board[row][column];
    }

    public void playAt(int row, int column) {
        char currentPlayer = getCurrentPlayer();
        board[row][column] = currentPlayer;
        setPreviousPlayer(currentPlayer);
    }

    private void setPreviousPlayer(char currentPlayer) {
        previousPlayer = currentPlayer;
    }

    private char getCurrentPlayer() {
        return previousPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    public char getWinner() {
        if (isAnyRowFilledByPlayer(PLAYER_X) || isFirstColumnFilledByPlayer(PLAYER_X, POSITION_ZERO)
                || isSecondColumnFilledByPlayer(PLAYER_X)) {
            return PLAYER_X;
        }

        if (isAnyRowFilledByPlayer(PLAYER_O) || isFirstColumnFilledByPlayer(PLAYER_O, POSITION_ZERO)
                || isSecondColumnFilledByPlayer(PLAYER_O)) {
            return PLAYER_O;
        }

        if (isThirdColumnFilledByPlayer(PLAYER_X)) {
            return PLAYER_X;
        }

        if (isThirdColumnFilledByPlayer(PLAYER_O)) {
            return PLAYER_O;
        }

        return '\0';
    }

    private boolean isThirdColumnFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_TWO) == player
                && getPlayerAt(POSITION_ONE, POSITION_TWO) == player
                && getPlayerAt(POSITION_TWO, POSITION_TWO) == player;
    }

    private boolean isSecondColumnFilledByPlayer(char player) {
        return getPlayerAt(POSITION_ZERO, POSITION_ONE) == player
                && getPlayerAt(POSITION_ONE, POSITION_ONE) == player
                && getPlayerAt(POSITION_TWO, POSITION_ONE) == player;
    }

    private boolean isFirstColumnFilledByPlayer(char player, int columnZero) {
        return getPlayerAt(POSITION_ZERO, columnZero) == player
                && getPlayerAt(POSITION_ONE, columnZero) == player
                && getPlayerAt(POSITION_TWO, columnZero) == player;
    }

    private boolean isAnyRowFilledByPlayer(char player) {
        return isRowFilledByPlayer(POSITION_ZERO, player) || isRowFilledByPlayer(POSITION_ONE, player)
                || isRowFilledByPlayer(POSITION_TWO, player);
    }

    private boolean isRowFilledByPlayer(int rowPosition, char player) {
        return getPlayerAt(rowPosition, POSITION_ZERO) == player
                && getPlayerAt(rowPosition, POSITION_ONE) == player
                && getPlayerAt(rowPosition, POSITION_TWO) == player;
    }

}
