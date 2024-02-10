import java.io.*;
import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) throws IOException{

		/* This code creates a file with some numbers in it so Hackerarnk
        PrintWriter createFile = new PrintWriter("in.txt");
        createFile.println("23");
        createFile.println("18");
        createFile.println("59");
        createFile.println("63");
        createFile.close();

        /* Write your code in here */

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a file name:");
        String iFile = sn.nextLine();
        File f = new File(iFile);
        Scanner inputFile = new Scanner(f);

        System.out.println("Please enter a file name:");
        String oFile = sn.nextLine();
        PrintWriter pw = new PrintWriter(oFile);

        while (inputFile.hasNext()) {
            int num = inputFile.nextInt();
            if (isPrime(num) == true) {
                System.out.println(num);
                pw.println(num);
            }
        }

        File outputFile = new File("out.txt");
        Scanner s = new Scanner(outputFile);
        while(s.hasNext())
            System.out.println(s.next());

        pw.close();
        inputFile.close();
    }
}