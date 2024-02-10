public class HomeworkGrades {

    private double[] grades;

    public HomeworkGrades(double[] g) {
        grades = new double[g.length];
        for (int i = 0; i < g.length; i++) {
            grades[i] = g[i];
        }
    }

    public void avg() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.printf("Average: %.2f\n", sum/grades.length);
    }

    public void lowest() {
        double low = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < low) {
                low = grades[i];
            }
        }
        System.out.printf("Lowest grade %.2f\n", low);
    }
}
