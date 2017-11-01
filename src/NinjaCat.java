import java.awt.*;

public class NinjaCat extends Critter {
    private int count = 0;
    private int countSt = -1;

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            if (count % 6 == 0) {
                count++;
                return Action.RIGHT;
            } else {
                count++;
                return Action.LEFT;
            }
        }
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        countSt++;
        return "-" + countSt + "-";
    }
}
