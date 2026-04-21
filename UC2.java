import java.util.Random;

/**
 * UC2: Toss to decide first player and assign symbols
 */

public class UC2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() {

        Random random = new Random();

        int toss = random.nextInt(2);   // 0 or 1

        if (toss == 0) {

            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';

        } else {

            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {

        if (isHumanTurn) {
            System.out.println("Human won the toss and will play first.");
        } else {
            System.out.println("Computer won the toss and will play first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
