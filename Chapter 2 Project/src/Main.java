import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double stateTax = 0.04;
        final double countyTax = 0.02;

        System.out.print("Enter the purchase amount: ");
        double price = in.nextFloat();
        in.nextLine();

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Dear: " + name.toUpperCase() + ", your item was $"
                + price);
        System.out.println("State sales tax: $" + (price * stateTax));
        System.out.println("County sales tax: $" + (price * countyTax));
        System.out.println("Total to be paid: $" + (price + (price * countyTax)
                + (price * stateTax)));
    }
}