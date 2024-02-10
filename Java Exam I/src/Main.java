import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String name = "Brendan";
        int count = 0;

        while(count < name.length()) {
            System.out.println(name.charAt(count));
            count += 2;
        }
    }
}