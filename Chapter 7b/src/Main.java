import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int[] fileToArray(Scanner sn) throws IOException{
        System.out.println("Please enter the file path: ");
        String filename = sn.nextLine();

        File file = new File(filename);
        Scanner f = new Scanner(file);

        int sum = 0;

        while (f.hasNext()) {
            int num = f.nextInt();
            sum++;
        }

        f.close();
        int[] arr = new int[sum];
        sum = 0;
        f = new Scanner(file);

        while (f.hasNext()) {
            int num = f.nextInt();
            arr[sum] = num;
            sum++;
        }

        f.close();

        return arr;
    }


    public static void main(String[] args) throws IOException{
        Scanner sn = new Scanner(System.in);

        int[] arr = fileToArray(sn);

        Arrays.sort(arr);

        System.out.println("Please enter a number to search for, or -1 to quit: ");
        int num = sn.nextInt();

        while (num != -1) {
            int index = Arrays.binarySearch(arr, num);
            if (index > -1) {
                System.out.printf("Found at position: %d\n", index);
            }
            else {
                System.out.println("Number not found");
            }

            System.out.println("Please enter a number to search for, or -1 to quit: ");
            num = sn.nextInt();
        }
    }
}