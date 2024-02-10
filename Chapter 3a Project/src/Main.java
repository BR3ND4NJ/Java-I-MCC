import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        float distance;
        String material;
        final int air = 1100;
        final int water = 4900;
        final int steel = 16400;
        float answer;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the distance the sound wave will"
                + " travel: ");
        distance = in.nextInt();
        in.nextLine();

        if (distance < 0){
            System.out.print("Distance cannot be negative. Exiting.");
            System.exit(0);
        }

        System.out.print("Enter one of the following: air, water, or"
                + " steel: ");
        material = in.nextLine().toLowerCase();

        switch(material){
            case "air":
                answer = (distance/air);
                System.out.print("It will take " + df.format(answer)
                        + " seconds.");
                break;
            case "water":
                answer = distance/water;
                System.out.print("It will take " + df.format(answer)
                        + " seconds.");
                break;
            case "steel":
                answer = distance/steel;
                System.out.print("It will take " + df.format(answer)
                        + " seconds.");
                break;
            default:
                System.out.print("Sorry, you must enter air, water, or"
                        + " steel.");
        }
    }
}