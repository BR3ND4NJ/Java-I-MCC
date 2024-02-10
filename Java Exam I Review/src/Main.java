import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void er1(Scanner sn) {
        int i = 1;
        while(i < 101) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 100; j++) {
            System.out.println(j + 1);
        }

        i = 1;

        do {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 101);

        System.out.println();

        System.out.print("Enter your first String: ");
        String s1 = sn.nextLine();

        System.out.print("Enter a second String: ");
        String s2 = sn.nextLine();

        if (s1.compareTo(s2) != 0) {
            System.out.println("The two strings are not equal");
        }
        else {
            System.out.println("The two strings are equal");
        }

        System.out.println();

        System.out.print("Enter a starting number: ");
        int num1 = sn.nextInt();

        System.out.print("Enter an ending number: ");
        int num2 = sn.nextInt();

        while (num2 < num1) {
            System.out.print("Enter a valid ending number: ");
            num2 = sn.nextInt();
        }
        sn.nextLine();

        for (int n = num1; n < num2; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }


    public static void er2(Scanner sn) {
        System.out.println("Enter your full name");
        String fullName = sn.nextLine();

        System.out.println("Enter your address");
        String address1 = sn.nextLine();

        System.out.println("Enter your town and state");
        String address2 = sn.nextLine();

        StringBuilder fullAddress = new StringBuilder();
        fullAddress.append(address1);
        fullAddress.append(" ");
        fullAddress.append(address2);

        System.out.printf("Name: %s\n", fullName);
        System.out.printf("Name length: %d\n", fullName.length());
        System.out.printf("Address: %s\n", fullAddress);
        System.out.printf("Address length: %d\n", fullAddress.length());
    }


    public static void er3(Scanner sn) {
        HashMap<String, Double> h = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter movie #%d: ", i + 1);
            String movie = sn.nextLine();

            System.out.printf("Enter price of %s: ", movie);
            double price = sn.nextDouble();
            sn.nextLine();

            h.put(movie, price);
        }

        int count = 0;
        int sum = 0;

        for (String i : h.keySet()) {
            sum += h.get(i);
            count++;
        }

        System.out.printf("The average price of your movies is: %d\n", sum/count);
    }


    public static void er4(Scanner sn) {
        System.out.print("Enter your age: ");
        int age = sn.nextInt();
        sn.nextLine();

        if (age > 65) {
            System.out.println("You are old enough");
        }
        else if (age > 40) {
            System.out.println("Your age is just right");
        }
    }


    public static void er5(Scanner sn) {
        System.out.print("Enter a number between 0-5: ");
        int num = sn.nextInt();

        while (num > 5 || num < 0) {
            System.out.print("Enter a valid number between 0-5: ");
            num = sn.nextInt();
        }

        int remainder = num % 2;

        switch (remainder) {
            case 0 -> System.out.println("Your number is even!");
            case 1 -> System.out.println("Your number is odd!");
            default -> {
            }
        }

        sn.nextLine();
    }


    public static void er6(Scanner sn) {
        System.out.print("Enter grade percentage: ");
        double grade = sn.nextDouble();

        while (grade < 0 || grade > 100) {
            System.out.print("Enter a valid grade percentage: ");
            grade = sn.nextDouble();
        }
        sn.nextLine();

        if (grade >= 90) {
            System.out.println("You have an A");
        }
        else if (grade >= 80) {
            System.out.println("You have a B");
        }
        else if (grade >= 70) {
            System.out.println("You have a C");
        }
        else if (grade >= 60) {
            System.out.println("You have a D");
        }
        else {
            System.out.println("You have an F");
        }
    }


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        char answer = 'y';

        while(answer != 'n') {
            System.out.print("Enter a program between 1-6: ");
            int method = sn.nextInt();
            sn.nextLine();

            while (method < 1 || method > 6) {
                System.out.print("Enter a program between 1-6: ");
                method = sn.nextInt();
                sn.nextLine();
            }

            switch (method) {
                case 1 -> er1(sn);
                case 2 -> er2(sn);
                case 3 -> er3(sn);
                case 4 -> er4(sn);
                case 5 -> er5(sn);
                case 6 -> er6(sn);
            }

            System.out.print("Would you like to run another program (y/n)?: ");
            answer = sn.nextLine().toLowerCase().charAt(0);
        }
    }
}