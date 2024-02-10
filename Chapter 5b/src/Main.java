import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1: Enter name only");
        System.out.println("2: Enter name and banner ID");

        int choice = sn.nextInt();

        while (choice < 1 || choice > 2) {
            System.out.println("Invalid choice. Choose again.\n");
            System.out.println("Choose an option:");
            System.out.println("1: Enter name only");
            System.out.println("2: Enter name and banner ID");

            choice = sn.nextInt();
        }

        sn.nextLine();

        Student s = new Student();

        if (choice == 1) {
            System.out.println("Enter name");
            s.name = sn.nextLine();
            s.bannerID = "";
        }
        else {
            System.out.println("Enter name");
            s.name = sn.nextLine();
            System.out.println("Enter banner ID");
            s.bannerID = sn.nextLine();
        }

        System.out.printf("Name: %s, Banner ID: %s", s.name, s.bannerID);
    }
}