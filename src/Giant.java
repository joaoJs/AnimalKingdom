import java.awt.*;

public class Giant extends Critter {

    public Action getMove(CritterInfo info) {
        return Action.LEFT;
    }

    public Color getColor() {
        return Color.BLUE;
    }

    public String toString() {
        return "G";
    }
}
