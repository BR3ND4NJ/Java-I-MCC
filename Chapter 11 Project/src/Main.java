import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //PrintWriter createFile = new PrintWriter("temperature.txt");
        //createFile.println("82.5\n30\n92\n78\n32\n98.8\n-1\nbanana\ngrapes\nanimal\nStop\n45");
        //createFile.close();

        String iFile = "temperature.txt";
        File file = new File(iFile);
        Scanner inputFile = new Scanner(file);
        float Fah;

        String oFile = "celsius.txt";
        PrintWriter outputFile = new PrintWriter(oFile);

        Fah = inputFile.nextFloat();

        while(Fah != -1){
            float c = ((Fah - 32) * (5/9f));
            outputFile.printf("%.2f\n", c);
            Fah = inputFile.nextFloat();
        }

        inputFile.nextLine();

        String line = "";

        line = inputFile.nextLine();

        String first = line;
        String last = line;

        while(!line.equalsIgnoreCase("stop")){
            if(line.compareToIgnoreCase(first) < 0){
                first = line;
            }else if(line.compareToIgnoreCase(last) > 0){
                last = line;
            }
            line = inputFile.nextLine();
        }

        outputFile.println("First word will be: " + first);
        outputFile.println("Last word will be: " + last);

        int num = inputFile.nextInt();

        while(num < 1 || num > 50){
            outputFile.println("Invalid number. Enter a number between "
                    + "1-50.");
            num = inputFile.nextInt();
        }

        for(int i = num; i < 61; i++){
            outputFile.printf("%.1f", Math.pow(i, 2));
            if(i != 60){
                outputFile.print(", ");
            }
        }
        inputFile.close();
        outputFile.close();

        //Scanner input = new Scanner( new File ("celsius.txt"));
        //while(input.hasNext())
            //System.out.println(input.nextLine());
    }
}