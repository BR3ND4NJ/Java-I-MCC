import java.util.Random;

public class Die {

    int sides;
    int value;
    String owner;
    Random rand = new Random();

    public Die() {}

    public Die (int sides, int value, String owner, long seed) {
        rand.setSeed(seed);
        this.sides = sides;
        this.value = value;
        this.owner = owner;
    }

    public int roll(int sides) {
        int num = rand.nextInt(sides) + 1;
        return num;
    }

    public void setSides(int s) {sides = s;}

    public void setValue(int v) {value = v;}

    public void setOwner(String o) {owner = o;}

    public int getSides() {return sides;}

    public int getValue() {return value;}

    public String getOwner() {return owner;}
}
