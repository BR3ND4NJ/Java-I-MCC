import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final float pi = 3.14f;
        int num, base, height, radius;

        System.out.println("Enter 1 if you would like to calculate the "
                + "area of a circle");
        System.out.println("Enter 2 if you would like to calculate the "
                + "area of a rectangle");
        System.out.println("Enter 3 if you would like to calculate the "
                + "area of a triangle. :");

        num = in.nextInt();

        switch (num){
            case 1:
                System.out.println("You have chosen to find the area of a"
                        + " circle. Please enter the radius.");
                radius = in.nextInt();
                System.out.println("The area is: " +
                        pi*Math.pow(radius, 2));
                break;

            case 2:
                System.out.println("You have chosen to find the area of a"
                        + " rectangle. Please enter the length.");
                base = in.nextInt();
                System.out.println("Now enter the width.");
                height = in.nextInt();
                System.out.println("The area is: " + base*height);
                break;

            case 3:
                System.out.println("You have chosen to find the area of a"
                        + " triangle. Please enter the base dimension.");
                base = in.nextInt();
                System.out.println("Now enter the height dimension.");
                height = in.nextInt();
                System.out.println("The area is: " + base*height/2.0);
                break;

            default:
                System.out.println("You have enter an invalid option."
                        + "  Please try again.");
        }

    }
}