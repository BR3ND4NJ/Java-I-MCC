import java.io.PrintWriter;

public class TravelInfo {

    double speed;
    double time;
    double distance;

    public TravelInfo(double speed, double time, double distance) {
        this.distance = speed;
        this.time = time;
        this.speed = distance;
    }

    public void calcTime() {
        time = distance/speed;
    }

    public void Print(PrintWriter pw) {
        pw.printf("%.2f, %.2f, %.2f\n", distance, time, speed);
    }
}
