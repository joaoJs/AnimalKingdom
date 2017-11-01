import java.awt.*;

public class Bear extends Critter {

    public Action getMove(CritterInfo info) {
        return Action.RIGHT;
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public String toString() {
        return "B";
    }

}
