import java.io.*;
import java.util.Scanner;


class UnderGrad {

    String name;
    String major;
    int years;


    public UnderGrad() {}


    public UnderGrad(String name, String major) {
        this.name = name;
        this.major = major;
    }


    public UnderGrad(String name, String major, int years) {
        this.name = name;
        this.major = major;
        this.years = years;
    }


    public int getYears() {
        return years;
    }


    public void setMajor(String m) {
        major = m;
    }


    public void print() {
        System.out.printf("Name: %s\nMajor: %s\nYears left: %d", name, major, years);
    }


    public double calcTuition(double ppyear) {
        return (ppyear*years);
    }
}


public class Main {
    public static void squareSmallest(float a, float b) {
        System.out.println(Math.pow(Math.min(a, b), 2));
    }


    public static void printEvenNumbers(Scanner sn) throws IOException {
        System.out.println("Enter an input file name:");
        String filename = sn.nextLine();
        File file = new File(filename);
        Scanner f = new Scanner(file);

        System.out.println("Enter an output file:");
        String output = sn.nextLine();
        PrintWriter pw = new PrintWriter(output);

        while (f.hasNext()) {
            int num = f.nextInt();
            if (num % 2 != 0) {
                continue;
            }
            else {
                pw.println(num);
            }
        }

        f.close();
        pw.close();
    }


    public static int charCounter(String s, char c) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }

        return sum;
    }


    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);

        System.out.println("What is your name?:");
        String n = sn.nextLine();

        System.out.println("What is your major?:");
        String m = sn.nextLine();

        System.out.println("How many years left until graduation?:");
        int y = sn.nextInt();

        UnderGrad s1 = new UnderGrad(n, m, y);

        System.out.println("What is the cost per year?:");
        double cost = sn.nextDouble();

        System.out.printf("The cost of your tuition is: $%,.2f", s1.calcTuition(cost));
    }
}