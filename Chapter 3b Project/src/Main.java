import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Fah;

        System.out.println("Enter a temperature. When done, enter -1");
        Fah = scanner.nextFloat();

        while(Fah != -1){
            float c = ((Fah - 32) * (5/9f));
            System.out.printf("%.2f\n", c);
            Fah = scanner.nextFloat();
        }

        scanner.nextLine();

        String input = "";

        System.out.println("Enter a series of strings on different "
                + "lines. When done, type \"stop\"");
        input = scanner.nextLine();

        String first = input;
        String last = input;

        while(!input.equalsIgnoreCase("stop")){
            if(input.compareToIgnoreCase(first) < 0){
                first = input;
            }else if(input.compareToIgnoreCase(last) > 0){
                last = input;
            }
            input = scanner.nextLine();
        }

        System.out.println("First word will be: " + first);
        System.out.println("Last word will be: " + last);

        System.out.println("Enter a number between 1-50.");
        int num = scanner.nextInt();

        while(num < 1 || num > 50){
            System.out.println("Invalid number. Enter a number between "
                    + "1-50.");
            num = scanner.nextInt();
        }

        for(int i = num; i < 61; i++){
            System.out.printf("%.1f", Math.pow(i, 2));
            if(i != 60){
                System.out.print(", ");
            }
        }
    }
}