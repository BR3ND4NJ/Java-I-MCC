import java.util.Scanner;

public class Main {

    public static char showCharacter(String s, int i) {
        char c = s.charAt(i);
        return c;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String input;
        int index;

        System.out.println("Please enter a String");
        input = sn.nextLine();

        System.out.println("Please enter the character's position");
        index = sn.nextInt();

        while (index < 0 || index > input.length() - 1) {
            System.out.println("Invalid Position. Enter a valid position");
            index = sn.nextInt();
        }

        System.out.printf("The letter at position %d is %c",
                index, showCharacter(input, index));
    }
}