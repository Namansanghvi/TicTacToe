/**
 * TicTacToe
 * UC5 validates whether a move is valid.
 * It checks board boundaries and ensures the cell is empty.
 */

public class UC5 {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        if (isValidMove(row, col)) {
            System.out.println("Move is valid");
        } else {
            System.out.println("Move is invalid");
        }
    }

    /**
     * Checks if a move is valid.
     * Row and column must be between 0 and 2.
     * Cell must be empty ('-').
     */
    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}
