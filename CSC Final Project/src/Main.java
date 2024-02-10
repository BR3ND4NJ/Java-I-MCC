import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Reservation {
    String fname;
    String lname;
    double price;
    int num;
    char let;

    /**
     * This is just a reservation constructor that allows the program to create
     * a reservation object
     * @param fname: First name
     * @param lname: Last name
     * @param price: Price of reservation
     * @param num: Seat number (1-30)
     * @param let: Seat number (A-E)
     */
    public Reservation(String fname, String lname, double price, int num, char let) {
        this.fname = fname;
        this.lname = lname;
        this.price = price;
        this.num = num;
        this.let = let;
    }

    /**
     * This function just makes the reservation object more legible to the user
     * @return Returns a string for reservation objects in a legible format
     */
    public String toString() {
        return String.format("Name: %s %s, Price: $%,.2f, Seat: %d%s\n", fname, lname,
                price, num, let);
    }

    public void setFname(String f) {
        fname = f;
    }

    public void setLname(String l) {
        lname = l;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setNum(int n) {
        num = n;
    }

    public void setLet(char le) {
        let = le;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public char getLet() {
        return let;
    }
}

public class Main {
    /**
     * This function reads the stats.txt file and prints out the information in it
     * @param reservations: This is the arraylist filled with reservation objects
     * @throws IOException
     */
    public static void printStatsFile(ArrayList<Reservation> reservations) throws IOException {
        File file = new File("stats.txt");
        Scanner f = new Scanner(file);
        while (f.hasNext()) {
            System.out.println(f.nextLine());
        }
    }

    /**
     * This function appends the organized last names on top of the organized information
     * from the download reservations file. It also adds the highest price of all the
     * flights and The total cost of all the reservations.
     * @param reservations: This is the arraylist filled with reservation objects
     * @throws IOException
     */
    public static void createStatsFile(ArrayList<Reservation> reservations) throws IOException {
        downloadReservations("stats.txt", reservations);
        FileWriter fw = new FileWriter("stats.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        ArrayList<String> lnames = new ArrayList<>();
        double highest = 0;

        for (Reservation r : reservations) {
            lnames.add(r.lname);
            highest = Math.max(highest, r.price);
        }

        Collections.sort(lnames);

        for (String s : lnames) {
            pw.println(s);
        }

        pw.println();

        pw.printf("The highest price is $%.2f\n", highest);
        pw.printf("Total cost of reservations is $%.2f\n", getTotalPrice(reservations));

        pw.close();
    }

    /**
     * This function just adds all the prices of each reservation giving us the sum
     * @param reservations: This is the arraylist filled with reservation objects
     * @return: Returns the sum of all the prices in the arraylist of reservation
     * objects
     */
    public static double getTotalPrice(ArrayList<Reservation> reservations) {
        double sum = 0;

        for (Reservation i : reservations) {
            sum += i.getPrice();
        }

        return sum;
    }

    /**
     * This function changes the seat of a reservation that was already made. It takes
     * the first and last name as input and changes the seat number and letter.
     * @param sn: Passes through the scanner, so it can prompt the user for their
     *          credentials
     * @param reservations: This is the arraylist filled with reservation objects
     */
    public static void updateSeat(Scanner sn, ArrayList<Reservation> reservations) {
        System.out.println("Enter first name and last name of reservation owner to update:");
        String fname = sn.nextLine();
        String lname = sn.nextLine();

        System.out.println("Enter new number seat number:");
        int num = sn.nextInt();
        while (num < 1 || num > 30) {
            System.out.println("Invalid seat number. Enter a number from 1-30:");
            num = sn.nextInt();
        }
        sn.nextLine();

        System.out.println("Enter new seat letter");
        char let = sn.nextLine().charAt(0);
        while (let < 'A' || let > 'E') {
            System.out.println("Invalid seat letter. Enter a letter from A-E:");
            let = sn.nextLine().charAt(0);
        }

        for (Reservation i : reservations) {
            if (i.fname.equals(fname)) {
                i.num = num;
                i.let = let;
            }
        }

        System.out.println("Updated Reservation!");
        System.out.println();
    }

    /**
     * This function simply puts the information in the arraylist of reservations into
     * something more readable. It outputs to the stats.txt file.
     * @param filename: The name of the file that the user would like to upload
     * @param reservations: This is the arraylist filled with reservation objects
     * @throws IOException
     */
    public static void downloadReservations(String filename, ArrayList<Reservation> reservations) throws IOException {
        PrintWriter pw = new PrintWriter(filename);

        for (Reservation i : reservations) {
            String s = i.toString();
            pw.print(s);
        }

        pw.println();
        pw.close();
    }

    /**
     * This function asks the user for the name of the file they want to read. It reads
     * the file and then creates reservation objects, which it stores in the "r"
     * arraylist in main, creating an organized arraylists of reservations.
     * @param sn: Scanner object to prompt the user for the file name to upload
     * @param reservations: This is the arraylist filled with reservation objects
     * @throws IOException
     */
    public static void uploadReservations(Scanner sn, ArrayList<Reservation> reservations) throws IOException {
        System.out.println("Enter file name to upload:");
        String filename = sn.nextLine();
        File iFile = new File(filename);
        Scanner f = new Scanner(iFile);

        while (f.hasNext()) {
            String line = f.nextLine();
            String[] items = new String[5];
            for (int i = 0; i < 5; i++) {
                items[i] = line.split(" ")[i];
            }
            addReservation(items[0], items[1], Double.parseDouble(items[2]),
                    Integer.parseInt(items[3]), items[4].charAt(0), reservations);
        }

        System.out.println("Upload successful!");
        System.out.println();
        System.out.println();
    }

    /**
     * This function just prints out all the reservations to the system.out so the
     * user can see them.
     * @param reservations: This is the arraylist filled with reservation objects
     */
    public static void viewReservations(ArrayList<Reservation> reservations) {
        for (Reservation r : reservations) {
            String s = r.toString();
            System.out.print(s);
        }
        System.out.println();
    }

    /**
     * This function asks the user for all the information to make a new reservation
     * object and then calls the other addReservation function to add it to the
     * arraylist of reservation objects
     * @param sn: Scanner object to prompt the user to enter reservation information
     * @param reservations: This is the arraylist filled with reservation objects
     */
    public static void addReservation(Scanner sn, ArrayList<Reservation> reservations) {
        System.out.println("Enter first name:");
        String fname = sn.nextLine();

        System.out.println("Enter last name:");
        String lname = sn.nextLine();

        System.out.println("Enter flight price:");
        double price = sn.nextDouble();

        System.out.println("Enter seat number:");
        int num = sn.nextInt();
        while (num < 1 || num > 30) {
            System.out.println("Invalid seat number. Enter a number from 1-30:");
            num = sn.nextInt();
        }
        sn.nextLine();

        System.out.println("Enter seat letter:");
        char let = sn.nextLine().charAt(0);
        while (let < 'A' || let > 'E') {
            System.out.println("Invalid seat letter. Enter a letter from A-E:");
            let = sn.nextLine().charAt(0);
        }

        addReservation(fname, lname, price, num, let, reservations);
        System.out.println("Reservation added!");
        System.out.println();
    }

    /**
     * This function takes the parameters f, l, p, n, and le, creates a reservation
     * object, and adds it to the arraylist of reservations.
     * @param f: First name
     * @param l: Last name
     * @param p: Price of reservation
     * @param n: Seat number (1-30)
     * @param le: Seat Letter (A-E)
     * @param reservations: This is the arraylist filled with reservation objects
     */
    public static void addReservation(String f, String l, double p, int n, char le,
                                      ArrayList<Reservation> reservations) {
        reservations.add(new Reservation(f, l, p, n, le));
    }

    /**
     * This function is where the user chooses which option they would like to
     * move forward with. It's what the user comes back to everytime they are
     * done with any of the options. It also creates the two different input files
     * to start with for hackerrank.
     * @param args: Any strings I would like to pass into main (none)
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{

        PrintWriter createFile = new PrintWriter("input.txt");
        createFile.println("Cat Dog 200 23 B");
        createFile.println("Rat Lion 178 15 A");
        createFile.println("Tiger Snake 135.99 6 D");
        createFile.println("Rabbit Fox 210.77 12 E");
        createFile.println("Lion Bird 133.12 1 C");
        createFile.println("Cat Fox 133.12 1 D");
        createFile.println("Lion Robin 200 23 A");
        createFile.println("Cat Bird 154.11 15 C");
        createFile.println("Monkey Bear 191.22 13 B");
        createFile.println("Tiger Dog 133.11 13 C");
        createFile.println("Bear Fox 177.11 12 C");
        createFile.println("Robin Snake 200 20 B");
        createFile.println("Lion Bird 112.43 20 A");
        createFile.println("Robin Snake 200.11 20 C");
        createFile.println("Cat Dog 123.13 20 E");
        createFile.close();

        PrintWriter createFile2 = new PrintWriter("input2.txt");
        createFile2.println("Mickey Mouse 140.23 18 B");
        createFile2.println("Minnie Mouse 92 5 A");
        createFile2.println("Iron Man 68.15 21 E");
        createFile2.println("Snow White 33.1 3 C");
        createFile2.close();

        Scanner sn = new Scanner(System.in);

        ArrayList<Reservation> r = new ArrayList<>();

        String displayMenu = "Welcome to MCC's Airline Reservation System. Please choose from the " +
                "following options:\n" +
                "1. Upload reservations\n" +
                "2. New reservation\n" +
                "3. Update seat\n" +
                "4. View all existing reservations\n" +
                "5. Create statistics file\n" +
                "6. Print statistics file\n" +
                "7. Exit the program\n";

        int choice = 1;

        while (choice != 7) {
            System.out.println(displayMenu);
            choice = sn.nextInt();
            sn.nextLine();

            switch (choice) {
                case 1 -> uploadReservations(sn, r);
                case 2 -> addReservation(sn, r);
                case 3 -> updateSeat(sn, r);
                case 4 -> viewReservations(r);
                case 5 -> createStatsFile(r);
                case 6 -> printStatsFile(r);
                default -> {
                }
            }
        }
    }
}