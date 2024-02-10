import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter your name:");
        e1.setName(sn.nextLine());

        System.out.println("Enter your salary:");
        e1.setSalary(sn.nextFloat());
        sn.nextLine();

        System.out.println("Enter your name:");
        e2.setName(sn.nextLine());

        System.out.println("Enter your salary:");
        e2.setSalary(sn.nextFloat());
        sn.nextLine();

        System.out.printf("Employee 1: %s, salary: %.2f\n", e1.getName(), e1.getSalary());
        System.out.printf("Employee 2: %s, salary: %.2f\n", e2.getName(), e2.getSalary());
    }
}