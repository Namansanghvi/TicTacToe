public class UC6 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board (same logic as UC1)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Place move (simulate valid move)
        placeMove(1, 1, 'X');

        // Print board to verify
        printBoard();
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}
