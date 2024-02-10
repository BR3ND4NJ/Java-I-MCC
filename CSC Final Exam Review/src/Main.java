import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class Main {


    public static float getArrayTotal(float[] arr) {
        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }


    public static float getSmallestNumber(float[] arr) {
        float num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            num = Math.min(num, arr[i]);
        }

        return num;
    }


    public static float[] readNumbersIntoArray(Scanner sn) throws IOException {
        System.out.println("Enter name of file:");
        String filename = sn.nextLine();
        File file = new File(filename);
        Scanner f = new Scanner(file);

        ArrayList<Float> nums = new ArrayList<>();

        while (f.hasNext()) {
            nums.add(f.nextFloat());
        }

        f.close();
        float[] arr = new float[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }

        return arr;
    }


    public static void main(String[] args) throws IOException{
        Scanner sn = new Scanner(System.in);

        float[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(getArrayTotal(arr));
        System.out.println(getSmallestNumber(arr));
        float[] arr2 = readNumbersIntoArray(sn);
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}