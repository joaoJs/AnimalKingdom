import java.awt.*;

public class NinjaCat extends Critter {

    public Action getMove(CritterInfo info) {
        return Action.HOP;
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return "NC";
    }
}
