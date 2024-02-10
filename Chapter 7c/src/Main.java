import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //create the file for hackerrank to test with
        //PrintWriter createFile = new PrintWriter("in.txt");
        //createFile.println("100 25");
        //createFile.println("300 75");
        //createFile.println("250 45");
        //createFile.close();

        Scanner sn = new Scanner(System.in);
        ArrayList<TravelInfo> tInfos = new ArrayList<>(10);

        System.out.println("Please enter input file name:");
        String iFile = sn.nextLine();
        File file = new File(iFile);
        Scanner f = new Scanner(file);

        System.out.println("Please enter output file name:");
        String oFile = sn.nextLine();
        PrintWriter pw = new PrintWriter(oFile);

        while (f.hasNext()) {
            int dist = f.nextInt();
            int sp = f.nextInt();
            tInfos.add(new TravelInfo(dist, 0, sp));
        }

        for (int i = 0; i < tInfos.size(); i++) {
            TravelInfo t = tInfos.get(i);
            t.calcTime();
            t.Print(pw);
        }

        f.close();
        pw.close();

        // open output file and read contents for hackerrank to verify content
        //File inFile = new File(outName);
        //Scanner s = new Scanner(inFile);
        //while(s.hasNext())
        //    System.out.println(s.nextLine());
        //s.close();
    }
}