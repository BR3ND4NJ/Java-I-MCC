public class Main {


    public static void findAverage(double[][] e) {
        for (int i = 0; i < e.length; i++) {
            double avg = 0;
            for (int j = 0; j < e[i].length; j++) {
                avg += e[i][j];
            }
            System.out.printf("Exam %d avg: %.2f\n", i + 1, avg / e[i].length);
        }
    }


    public static void main(String[] args) {
        double[][] exams = {
                {78, 98, 22, 67, 99},
                {100, 69, 87, 70, 56},
                {77, 85, 79, 97, 101}
        };

        findAverage(exams);

    }
}