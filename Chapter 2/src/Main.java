import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("What is your first name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        byte age = in.nextByte();
        in.nextLine();

        System.out.println("What is your last name?");
        String lastName = in.nextLine();

        System.out.println("Your first and last name contain " +
                (name.length() + lastName.length()) + " characters.");
        System.out.println("Upper Case: " + name.toUpperCase() + " " +
                lastName.toUpperCase());
        System.out.println("Lower Case: " + name.toLowerCase() + " " +
                lastName.toLowerCase());
        System.out.println("First Letter: " + name.charAt(0));
        System.out.println("Age: " + age);
    }
}