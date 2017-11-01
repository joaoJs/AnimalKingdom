import java.awt.*;

public class Tiger extends Critter {

    public Action getMove(CritterInfo info) {
        return Action.HOP;
    }

    public Color getColor() {
        return Color.ORANGE;
    }

    public String toString() {
        return "T";
    }
}
