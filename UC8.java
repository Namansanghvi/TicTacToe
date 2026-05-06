import java.util.Scanner;

/**
 * TicTacToe
 * UC8: Continuous game loop until win or draw
 */
public class UC8 {

    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        initializeBoard();
        Scanner sc = new Scanner(System.in);

        boolean gameRunning = true;

        while (gameRunning) {

            printBoard();

            System.out.println("Player " + currentPlayer + ", enter slot (1-9): ");
            int slot = sc.nextInt();

            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            if (isValidMove(row, col)) {

                placeMove(row, col, currentPlayer);

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } 
                else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } 
                else {
                    switchPlayer();
                }

            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        sc.close();
    }

    // Initialize board
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print board
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Slot → Row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Slot → Column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // Validate move
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == '-';
    }

    // Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Switch player
    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check win
    static boolean checkWin() {

        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer &&
                board[1][j] == currentPlayer &&
                board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Diagonals
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    // Check draw
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
