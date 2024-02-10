import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;


class Students {
    ArrayList<String> names = new ArrayList<>();
    String teacher;

    public Students() {}

    public Students(String teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacher;
    }

    public void setTeacherName(String t) {
        teacher = t;
    }

    public void addStudent(String name) {
        names.add(name);
    }

    public boolean studentExists(String name) {
        return names.contains(name);
    }
}


public class Main {
    public static ArrayList<String> readFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner f = new Scanner(file);

        ArrayList<String> al = new ArrayList<>();

        while (f.hasNext()) {
            al.add(f.nextLine());
        }

        f.close();

        return al;
    }


    public static void writeToFile(String[] s, String filename) throws IOException {
        File file = new File(filename);
        PrintWriter pw = new PrintWriter(file);

        for (String i : s) {
            pw.println(i);
        }

        pw.close();
    }


    public static void getArrayAverage(short[] arr) {
        float avg = 0;

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }

        avg = avg/arr.length;

        System.out.printf("The average is: %.3f", avg);
        System.out.println();
    }


    public static void main(String[] args) throws IOException {
        short[] myArray = {10, 50, 30, 40, 70};
        getArrayAverage(myArray);

        String[] arr = {"Cat", "Dog", "Car"};
        writeToFile(arr, "animals.txt");

        ArrayList<String> al = new ArrayList<>();
        al = readFile("animals.txt");

        System.out.print("[");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i));
            if (i != al.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        Scanner sn = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sn.nextLine();
        System.out.println(name.toUpperCase());

        Students s = new Students();
        s.setTeacherName(name);

        String n = "";
        while (!n.equals(".")) {
            System.out.println("Enter students name. Enter \".\" when done.");
            n = sn.nextLine();
            s.addStudent(n);
        }

        System.out.println("What student would you like to find?:");
        n = sn.nextLine();

        if (s.studentExists(n)) {
            System.out.println("Found Student");
        }
        else {
            System.out.println("Student not found");
        }
    }
}