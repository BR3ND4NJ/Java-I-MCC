import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int sumc = 0;
        int sums = 0;

        Die stu = new Die(0, 0, null, 100);
        Die comp = new Die(0, 0, "Computer", 200);

        System.out.println("Please enter name.");
        stu.owner = sn.nextLine();

        System.out.println("How many sides would you like the die to have?");
        stu.sides = sn.nextInt();
        comp.sides = stu.sides;

        System.out.println("How many iterations would you like to play?");
        int iter = sn.nextInt();

        for (int i = 0; i < iter; i++) {
            stu.value = stu.roll(stu.sides);
            comp.value = comp.roll(comp.sides);

            if (comp.value > stu.value) {
                sumc++;
            }
            else if (comp.value < stu.value) {
                sums++;
            }
            else{
                continue;
            }
        }

        System.out.printf("%s's score: %d\n", stu.owner, sums);
        System.out.printf("%s's score: %d\n", comp.owner, sumc);

        if (sums > sumc) {
            System.out.printf("The winner is %s\n", stu.owner);
        }
        else if (sumc > sums) {
            System.out.printf("The winner is %s\n", comp.owner);
        }
    }
}