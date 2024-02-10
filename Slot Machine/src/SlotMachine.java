/**
 * SlotMachine
 *
 * @author (Jimsly)
 * @version (2.7)
 **/

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    private static int wheel1;
    private static int wheel2;
    private static int wheel3;
    private static int bank;

    // Constructor
    public SlotMachine() {
        Random random = new Random();
        wheel1 = random.nextInt(7) + 1;
        wheel2 = random.nextInt(7) + 1;
        wheel3 = random.nextInt(7) + 1;
        bank = 0;
    }

    // toString method
    public String toString() {
        return "wheels: " + wheel1 + ", " + wheel2 + ", " + wheel3;
    }

    // bet method
    public String bet(int amount) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Welcome Player! Good Luck");

        bank = amount;

        if (amount <= 0) {
            System.out.println("Error: Please enter a bet greater than 0.");
            System.out.println("Error: Insufficient funds. Please enter a valid bet.");
            bet(sn.nextInt());
        }

        return String.format("You bet %d. Bank: %d\n", amount, amount);
    }

    // pull method
    public void pull() {
        if (bank <= 0) {
            System.out.println("Error: Insufficient funds to play.");
            return;
        }

        System.out.println("Lever Pulled");
        Random random = new Random();
        wheel1 = random.nextInt(7) + 1;
        wheel2 = random.nextInt(7) + 1;
        wheel3 = random.nextInt(7) + 1;

        System.out.println(toString());

        if (wheel1 != wheel2 && wheel2 != wheel3 && wheel1 != wheel3) {
            System.out.println("No matches. Nothing Won");
        } else if (wheel1 == 7 && wheel2 == 7 && wheel3 == 7) {
            bank += 100;
            System.out.println("Jackpot! 100 dollars.");
        } else if (wheel1 == wheel2 && wheel2 == wheel3) {
            bank += 6;
            System.out.println("Three the same. Won: 6 dollars");
        } else if (wheel1 == wheel2 || wheel2 == wheel3 || wheel1 == wheel3) {
            bank += 2;
            System.out.println("Two the same. Won: 2 dollars");
        }

        bank--; // Deduct one dollar for playing
        System.out.println("bank: " + bank + "\n");
    }

    // cashOut method
    public void cashOut() {
        System.out.println("Thanks for playing. Here is your " + bank + " dollars");
        bank = 0;
    }
}
