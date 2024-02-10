import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 50");
        int num = sn.nextInt();

        while (num < 1 || num > 50) {
            System.out.println("Please enter a number between 1 - 50");
            num = sn.nextInt();
        }

        sn.nextLine();

        System.out.println("Please enter the name of the output file");
        String userOutputFilename = sn.nextLine();
        PrintWriter pw = new PrintWriter(userOutputFilename);

        for (int i = num; i < 101; i++) {
            pw.printf("%.1f\n", (float)Math.pow(i, 2));
        }

        pw.close();

        File f = new File(userOutputFilename);
        Scanner input = new Scanner(f);
        while(input.hasNext()) {
            System.out.println(input.nextLine());
        }
    }
}