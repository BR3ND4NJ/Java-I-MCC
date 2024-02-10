import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count, sum, num;
        count = 0;

        System.out.println("Please enter a number.");
        num = scanner.nextInt();

        for (int i = 0; i < num/5; i++){
            count += 5;
            System.out.println(count);
        }

        float denom = 0.0f;
        sum = 0;

        while (denom < 1 || denom > 100){
            System.out.println("Please enter a number between 1 and 100.");
            denom = scanner.nextFloat();
        }

        for (int i = 0; i <= denom; i++){
            sum += i;
        }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.printf("The average of the numbers is: %.2f\n",
                sum/(denom));
    }
}