import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String ask(Scanner sn) {
        /*
        Function asks user for input
        returns: String of input in lowercase
         */

        System.out.println("Enter rock, paper, or scissors.");
        String input = sn.nextLine().toLowerCase();

        while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
            System.out.println("Please enter rock, paper, or scissors");
            input = sn.nextLine().toLowerCase();
        }

        return input;
    }


    public static String comp(Random rand) {
        /*
        Takes no inputs and generates a random number between 1 and 3
        Uses switch statment to determine what string the computer
        chose
        returns: a string
         */
        int num = rand.nextInt(3) + 1;

        String answer = "";

        switch (num) {
            case 1:
                answer = "rock";
                break;
            case 2:
                answer = "paper";
                break;
            case 3:
                answer = "scissors";
                break;
            default:
                break;
        }

        return answer;
    }


    public static int play(String a, String c) {
        /*
        Takes in two strings as parameters and decides who wins
        a rock paper scissor game
        String a: Player answer
        String c: Computer generated answer
        returns: an int 0 = user, 1 = computer, 2 = tie
         */

        System.out.printf("The computer's choice was %s.\n", c);
        System.out.printf("The user's choice was %s.\n", a);
        System.out.println();

        switch (a) {
            case "rock":
                if (c.equals("scissors")) {
                    System.out.println("Rock wins scissors.");
                    System.out.println("The user wins!");
                    return 0;
                } else if (c.equals("paper")) {
                    System.out.println("Paper wins rock.");
                    System.out.println("The computer wins!");
                    return 1;
                } else {
                    System.out.println("A tie. Play again.");
                    return 2;
                }
            case "paper":
                if (c.equals("rock")) {
                    System.out.println("Paper wins rock.");
                    System.out.println("the user wins!");
                    return 0;
                } else if (c.equals("scissors")) {
                    System.out.println("Scissors wins paper.");
                    System.out.println("The computer wins!");
                    return 1;
                } else {
                    System.out.println("A tie. Play again.");
                    return 2;
                }
            case "scissors":
                if (c.equals("paper")) {
                    System.out.println("Scissors win paper.");
                    System.out.println("The user wins!");
                    return 0;
                } else if (c.equals("rock")) {
                    System.out.println("Rock wins scissors.");
                    System.out.println("The computer wins!");
                    return 1;
                } else {
                    System.out.println("A tie. Play again.");
                    return 2;
                }
        }

        return 2;
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Random rand = new Random();
        rand.setSeed(50);

        String a = ask(sn);
        String c = comp(rand);
        int end = play(a, c);

        while(end == 2) {
            a = ask(sn);
            c = comp(rand);
            end = play(a, c);
        }
    }

}