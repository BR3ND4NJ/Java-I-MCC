public class Main {
    public static void main(String[] args) {
        SlotMachine s = new SlotMachine();

        System.out.println(s.bet(200));

        for (int i = 0; i < 100; i++) {
            s.pull();
        }

        s.cashOut();
    }
}