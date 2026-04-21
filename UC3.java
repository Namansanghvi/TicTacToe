import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user.
 * This use case focuses only on input handling without validation.
 */

public class UC3 {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static int getUserSlot() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");

        int slot = sc.nextInt();

        return slot;
    }
}
