import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float test1, test2, test3;
        String choice;
        char letter;

        System.out.print("Enter test score #1: ");
        test1 = in.nextFloat();
        System.out.print("Enter test score #2: ");
        test2 = in.nextFloat();
        System.out.print("Enter test score #3: ");
        test3 = in.nextFloat();
        in.nextLine();

        float average = ((test1 + test2 + test3)/3.0f);

        System.out.println("Choose one of the following options:");
        System.out.println("a: display the average");
        System.out.println("b: display the letter grade");

        choice = in.nextLine();
        letter = choice.charAt(0);

        if (letter == 'a'){
            System.out.println("Average score: " + average);
        }else if(letter == 'b'){
            if (average >= 90 && average <= 100){
                System.out.println("Letter grade: A");
            }else if (average >= 80 && average < 90){
                System.out.println("Letter grade: B");
            }else if (average >= 70 && average < 80){
                System.out.println("Letter grade: C");
            }else if (average >= 60 && average < 70){
                System.out.println("Letter grade: D");
            }else if (average < 60){
                System.out.println("Letter grade: F");
            }
        }
    }
}