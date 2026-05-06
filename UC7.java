import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move.
 */
public class UC7 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard();

        System.out.println("Before computer move:");
        printBoard();

        computerMove();

        System.out.println("After computer move:");
        printBoard();
    }

    // Initialize board with '-'
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

    // Convert slot to row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column
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

    // Computer makes random move
    static void computerMove() {

        Random rand = new Random();

        while (true) {

            int slot = rand.nextInt(9) + 1; // 1 to 9

            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }
}
