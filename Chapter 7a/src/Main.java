public class Main {

    public static void main(String[] args) {
        double[] grades = {98.7, 77.9, 90, 83, 67, 33, 81, 90};

        HomeworkGrades h = new HomeworkGrades(grades);

        h.avg();

        h.lowest();
    }
}