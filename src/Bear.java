import java.awt.*;

public class Bear extends Critter {
    private boolean polar;
    private int count = 0;

    public Bear(boolean p) {
        //super();
        polar = p;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    public Color getColor() {
        if (polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        if (count % 2 == 0) {
            count++;
            return "/";
        } else {
            count++;
            return "\\";
        }
    }

}
