import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 10;

        while(num <= 20){
            System.out.println(num);
            num++;
        }

        num = 10;

        do{
            System.out.println(num);
            num++;
        }while(num <= 20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 10 & 20");
        int ask = scanner.nextByte();

        while(ask < 10 || ask > 20){
            System.out.println("Invalid number. Please enter a number "
                    + "between 10 & 20.");
            ask = scanner.nextByte();
        }

        while(ask > 9 && ask < 21){
            while(ask <= 50){
                if (ask % 2 == 1){
                    ask++;
                }else{
                    System.out.println(ask);
                    ask += 2;
                }
            }
        }
    }
}