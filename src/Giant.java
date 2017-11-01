import java.awt.*;

public class Giant extends Critter {
    private int count = 0;

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if (count % 24 < 6) {
            count++;
            return "fee";
        } else if (count % 24 < 12) {
            count++;
            return "fie";
        } else if (count % 24 < 18) {
            count++;
            return "foe";
        } else {
            count++;
            return "fum";
        }
    }
}
