import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, name2;
        int age, age2;
        float percent, percent2;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the first student's name.");
        name = in.nextLine();
        System.out.println("Please enter the second student's name.");
        name2 = in.nextLine();
        System.out.println("Please enter " + name + "'s age.");
        age = in.nextInt();
        System.out.println("Please enter " + name2 + "'s age.");
        age2 = in.nextInt();
        System.out.println("Please enter " + name + "'s percentage in the"
                + " class.");
        percent = in.nextFloat();
        System.out.println("Please enter " + name2 + "'s percentage in the"
                + " class.");
        percent2 = in.nextFloat();

        if (name.compareTo(name2) < 0){
            System.out.printf("[%s,%6d, %.4f]\n", name, age,
                    percent);
            System.out.printf("[%s,%6d, %.4f]\n", name2, age2,
                    percent2);
        }else{
            System.out.printf("[%s,%6d, %.4f]\n", name2, age2,
                    percent2);
            System.out.printf("[%s,%6d, %.4f]\n", name, age,
                    percent);
        }

        if (age < age2){
            System.out.printf("[%s,%6d, %.4f]\n", name, age,
                    percent);
            System.out.printf("[%s,%6d, %.4f]\n", name2, age2,
                    percent2);
        }else{
            System.out.printf("[%s,%6d,%.4f]\n", name2, age2,
                    percent2);
            System.out.printf("[%s,%6d,%.4f]\n", name, age,
                    percent);
        }

        if (percent > percent2){
            System.out.printf("[%s,%6d,%.4f]\n", name, age,
                    percent);
            System.out.printf("[%s,%6d,%.4f]\n", name2, age2,
                    percent2);
        }else{
            System.out.printf("[%s,%6d,%.4f]\n", name2, age2,
                    percent2);
            System.out.printf("[%s,%6d,%.4f]\n", name, age,
                    percent);
        }
    }
}