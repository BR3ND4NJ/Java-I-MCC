import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String choice = "";

        Patient p1 = new Patient(null, null, null);
        Patient p2 = new Patient(null, null, null, 0);

        System.out.println("Please enter patient 1's first name:");
        p1.fname = sn.nextLine();
        System.out.println("Please enter patient 1's last name:");
        p1.lname = sn.nextLine();
        System.out.println("Please enter patient 1's address:");
        p1.address = sn.nextLine();

        while (!choice.equalsIgnoreCase("done")) {
            System.out.println("What would you like to do?");
            System.out.println("Add Charge");
            System.out.println("Pay Charge");
            System.out.println("Done");
            choice = sn.nextLine().toLowerCase();

            switch (choice) {
                case ("add charge"):
                    System.out.println("How much to charge your account?");
                    p1.addProcedureCost(sn.nextDouble());
                    break;
                case ("pay charge"):
                    System.out.println("How much would you like to pay?");
                    p1.payProcedureCost(sn.nextDouble());
                    break;
                default:
                    continue;
            }

            sn.nextLine();
        }

        System.out.println("Please enter patient 2's first name:");
        p2.fname = sn.nextLine();
        System.out.println("Please enter patient 2's last name:");
        p2.lname = sn.nextLine();
        System.out.println("Please enter patient 2's address:");
        p2.address = sn.nextLine();
        System.out.println("Please enter patient 2's total cost:");
        p2.tcost = sn.nextDouble();

        while (!choice.equalsIgnoreCase("done")) {
            System.out.println("What would you like to do?");
            System.out.println("Add Charge");
            System.out.println("Pay Charge");
            System.out.println("Done");
            choice = sn.nextLine().toLowerCase();

            switch (choice) {
                case ("add charge"):
                    System.out.println("How much to charge your account?");
                    p2.addProcedureCost(sn.nextDouble());
                    break;
                case ("pay charge"):
                    System.out.println("How much would you like to pay?");
                    p2.payProcedureCost(sn.nextDouble());
                    break;
                default:
                    continue;
            }

            sn.nextLine();
        }

        p1.displayPatient(p1);
        p2.displayPatient(p2);
    }
}