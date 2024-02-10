import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //PrintWriter createFile = new PrintWriter("in.txt");
        //createFile.println("3+,2 = 5m,");
        //createFile.println(" 7%,6 =1 hello");
        //createFile.close();

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter input file name");
        String filename = sn.nextLine();
        int sum = 0;

        String outputFile = "out.txt";
        PrintWriter pw = new PrintWriter(outputFile);

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ',') {
                    sum++;
                } else {
                    pw.print(line.charAt(i));
                }
            }
            pw.println();
        }

        System.out.printf("Detected " + sum + " commas.");

        inputFile.close();
        pw.close();
    }
}